/***********
 Workshop # 1
 Course: [Subject #] - [Semester]
 Last Name: [Student Last Name]
 First Name: [Student First Name]
 ID: [Student ID]
 *********
 This assignment represents my own work in accordance
 with Seneca Academic Policy.
 Date: January 14, 2026
 *********************/
package ca.senecacollege.views;

import ca.senecacollege.models.Vehicle;
import java.util.List;
import java.util.Scanner;

public class FleetView {
    private Scanner scanner = new Scanner(System.in);

    // Requirement 1
    public int readMileage(String vehicleName) {
        System.out.print("Enter the current mileage for " + vehicleName + " (km): ");
        return scanner.nextInt();
    }

    // Requirement 2
    public void displayUrgentVehicle(Vehicle v) {
        System.out.println("\n--: Requirement 2:--");
        if (v != null) {
            System.out.println("The vehicle requiring the most urgent maintenance is: " + v.getName());
            System.out.println(v.getName() + "'s purchase price is: $" + v.getPurchasePrice());
            System.out.println(v.getName() + "'s primary function: " + v.getPrimaryFunction());
            System.out.println(v.getName() + "'s service interval: Every " + v.getServiceInterval() + " km");
            System.out.println(v.getName() + "'s maintenance cost: $" + v.getMaintenanceCost());
        }
    }


    public void displayVehiclesByPrice(List<Vehicle> fleet) {
        System.out.println("\n--: Requirement 3 :--");
        System.out.println("Vehicles in Descending Order of Purchase Price:");
        for (Vehicle v : fleet) {

            System.out.println(v.toString());
        }
    }

    // Requirement 4:
    public String askCategory() {
        System.out.println("\n--: Requirement 4:--");
        System.out.print("Enter a vehicle category (PassengerVehicles, CommercialVehicles, SpecializedVehicles): ");
        return scanner.next();
    }

    public void displayCategoryVehicles(String categoryName, List<Vehicle> vehicles) {
        System.out.println("Vehicles in " + categoryName + " Category:");
        for (Vehicle v : vehicles) {
            System.out.println(v.getName() + " Primary Function: " + v.getPrimaryFunction() +
                    " Fuel Type: " + v.getFuelType());
        }
    }

    public void displayMaintenanceUrgency(List<Vehicle> fleet) {
        System.out.println("\n--: Requirement 5 & 6:--");
        System.out.println("Vehicles sorted by maintenance urgency (closest to service interval first):");
        for (Vehicle v : fleet) {
            int remaining = v.getServiceInterval() - (v.getCurrentMileage() % v.getServiceInterval());
            System.out.println(v.getName() + " (" + v.getCurrentMileage() + " km / " +
                    v.getServiceInterval() + " km - " + remaining + " km remaining)");
        }
    }
}