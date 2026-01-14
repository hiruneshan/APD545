package ca.senecacollege.controllers;

import ca.senecacollege.models.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetController {

    private List<Vehicle> fleet;

    public FleetController(List<Vehicle> fleet) {
        this.fleet = fleet;
    }

    // Requirement 2 & 5
    public Vehicle getMostUrgentVehicle() {
        Collections.sort(fleet); // uses compareTo()
        return fleet.get(0);
    }

    // Requirement 3
    public void sortByPurchasePriceDesc() {
        Collections.sort(
                fleet,
                (v1, v2) -> Double.compare(v2.getPurchasePrice(), v1.getPurchasePrice())
        );
    }

    // Requirement 4 (switch-case used here)
    public List<Vehicle> getVehiclesByCategory(String input) {

        String category;

        switch (input.toLowerCase()) {
            case "passengervehicles":
                category = "PassengerVehicles";
                break;
            case "commercialvehicles":
                category = "CommercialVehicles";
                break;
            case "specializedvehicles":
                category = "SpecializedVehicles";
                break;
            default:
                return new ArrayList<>();
        }

        List<Vehicle> result = new ArrayList<>();

        for (Vehicle v : fleet) {
            if (v.getCategory().equalsIgnoreCase(category)) {
                result.add(v);
            }
        }

        return result;
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }
}
