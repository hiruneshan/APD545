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
package ca.senecacollege.controllers;

import ca.senecacollege.models.*;
import ca.senecacollege.views.FleetView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetController {
    private List<Vehicle> fleet;
    private FleetView view;

    public FleetController(FleetView view) {
        this.view = view;
        this.fleet = new ArrayList<>();
    }


    public void runSystem() {
        fleet.add(new Sedan("Sedan", view.readMileage("Sedan")));
        fleet.add(new SUV("SUV", view.readMileage("SUV")));
        fleet.add(new Truck("Truck", view.readMileage("Truck")));
        fleet.add(new Van("Van", view.readMileage("Van")));
        fleet.add(new Ambulance("Ambulance", view.readMileage("Ambulance")));


        List<Vehicle> urgencyList = new ArrayList<>(fleet);
        Collections.sort(urgencyList);
        view.displayUrgentVehicle(urgencyList.get(0));


        List<Vehicle> priceList = new ArrayList<>(fleet);
        priceList.sort((v1, v2) -> Double.compare(v2.getPurchasePrice(), v1.getPurchasePrice()));
        view.displayVehiclesByPrice(priceList);


        String categoryInput = view.askCategory();
        view.displayCategoryVehicles(categoryInput, getVehiclesByCategory(categoryInput));

        view.displayMaintenanceUrgency(urgencyList);
    }


    public List<Vehicle> getVehiclesByCategory(String input) {
        List<Vehicle> filteredList = new ArrayList<>();

        String searchCategory;
        switch (input.toLowerCase()) {
            case "passengervehicles":
                searchCategory = "PassengerVehicles";
                break;
            case "commercialvehicles":
                searchCategory = "CommercialVehicles";
                break;
            case "specializedvehicles":
                searchCategory = "SpecializedVehicles";
                break;
            default:
                return filteredList;
        }

        for (Vehicle v : fleet) {
            switch (searchCategory) {
                case "PassengerVehicles":
                    if (v instanceof PassengerVehicles) filteredList.add(v);
                    break;
                case "CommercialVehicles":
                    if (v instanceof CommercialVehicles) filteredList.add(v);
                    break;
                case "SpecializedVehicles":
                    if (v instanceof SpecializedVehicles) filteredList.add(v);
                    break;
            }
        }
        return filteredList;
    }
}