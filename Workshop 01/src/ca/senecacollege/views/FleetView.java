package ca.senecacollege.views;

import ca.senecacollege.models.Vehicle;

import java.util.List;
import java.util.Scanner;

public class FleetView {

    private Scanner scan = new Scanner(System.in);

    // Requirement 1
    public int readMileage(String vehicleName) {
        System.out.print("Enter the current mileage for " + vehicleName + " (km): ");
        return scan.nextInt();
    }

    // Requirement 4
    public String askCategory() {
        scan.nextLine(); // clearing buffer
        System.out.print(
                "\nEnter a vehicle category (PassengerVehicles, CommercialVehicles, SpecializedVehicles): "
        );
        return scan.nextLine().trim();
    }

    // Requirement 2
    public void displayUrgentVehicle(Vehicle v) {
        System.out.println("\n--: Requirement 2 :--");
        System.out.println("The vehicle requiring the most urgent maintenance is: " + v.getName());
        System.out.println("Purchase Price: $" + v.getPurchasePrice());
        System.out.println("Primary Function: " + v.getPrimaryFunction());
        System.out.println("Service Interval: Every " + v.getServiceInterval() + " km");
        System.out.println("Maintenance Cost: $" + v.getMaintenanceCost());
    }

    // Requirement 3 output
    public void displayVehiclesByPrice(List<Vehicle> vehicles) {
        System.out.println("\n--: Requirement 3 :--");
        System.out.println("Vehicles in Descending Order of Purchase Price:");

        for (Vehicle v : vehicles) {
            System.out.println(v); // calls overridden toString()
        }
    }

    // Requirement 4
    public void displayCategoryVehicles(String category, List<Vehicle> vehicles) {

        System.out.println("\nVehicles in " + category + " Category:");

        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found in this category.");
            return;
        }

        for (Vehicle v : vehicles) {
            System.out.println(
                    v.getName() +
                            " - Primary Function: " + v.getPrimaryFunction() +
                            " - Fuel Type: " + v.getFuelType()
            );
        }
    }
}
