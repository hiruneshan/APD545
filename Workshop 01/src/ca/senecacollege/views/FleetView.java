/***********************************************
 Workshop # 01
 Course: APD545 - 04
 Last Name: Wijemanne
 First Name: Hiru
 ID: 135257236
 This assignment represents my own work in accordance
 with Seneca Academic Policy.
 Date: 1/20/2026
 ***********************************************/
package ca.senecacollege.views;

import ca.senecacollege.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class FleetView {
    private Scanner scanner = new Scanner(System.in);

    // Requirement 1
    public int readMileage(String vehicleName) {
        System.out.print("Enter the current mileage for " + vehicleName + " (km): ");
        int mileage = scanner.nextInt();
        scanner.nextLine(); // Clearing buffer after nextInt()
        return mileage;
    }

    // Requirement 2
    public void displayUrgentVehicle(Vehicle v) {
        System.out.println("\n--: Requirement 2:--");
        if (v != null) {
            String name = v.getName();
            System.out.println("The vehicle requiring the most urgent maintenance is: " + name);

            System.out.printf("%s's purchase price is: $%,.1f%n", name, v.getPurchasePrice());
            System.out.printf("%s's primary function: %s%n", name, v.getPrimaryFunction());
            System.out.printf("%s's service interval: Every %,d km%n", name, v.getServiceInterval());
            System.out.printf("%s's maintenance cost: $%,.1f%n", name, v.getMaintenanceCost());
        }
    }

    // Requirement 3
    public void displayVehiclesByPrice(List<Vehicle> fleet) {
        System.out.println("\n--: Requirement 3 :--");
        System.out.println("Vehicles in Descending Order of Purchase Price:");
        for (Vehicle v : fleet) {
            System.out.println(v.toString());
        }
    }

    // Requirement 4
    public String askCategory() {
        System.out.println("\n--: Requirement 4:--");
        System.out.print("Enter a vehicle category (PassengerVehicles, CommercialVehicles, SpecializedVehicles): ");
        return scanner.next();
    }

    public void displayCategoryVehicles(String categoryName, List<Vehicle> vehicles) {
        System.out.println("Vehicles in " + categoryName + " Category:");
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found in this category.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v.getName() + " Primary Function: " + v.getPrimaryFunction() +
                        " | Fuel Type: " + v.getFuelType());
            }
        }
    }

    // Requirement 5 & 6
    public void displayMaintenanceUrgency(List<Vehicle> fleet) {
        System.out.println("\n--: Requirement 5 & 6:--");
        System.out.println("Vehicles sorted by maintenance urgency (closest to service interval first):");

        for (Vehicle v : fleet) {

            int remaining = v.getServiceInterval() - v.getCurrentMileage();

            System.out.printf("%s (%,d km / %,d km - %,d km %s)%n",
                    v.getName(),
                    v.getCurrentMileage(),
                    v.getServiceInterval(),
                    Math.abs(remaining),
                    remaining < 0 ? "overdue" : "remaining"); // if the user has gone over board with the mileage, it will print overdue
        }
    }
}