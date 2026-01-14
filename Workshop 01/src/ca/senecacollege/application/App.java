package ca.senecacollege.application;

import ca.senecacollege.controllers.FleetController;
import ca.senecacollege.models.*;
import ca.senecacollege.views.FleetView;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // 1. Create View
        FleetView view = new FleetView();

        // 2. Create Model collection
        List<Vehicle> fleet = new ArrayList<>();

        // 3. Collect user input (via View)
        fleet.add(new Sedan("Sedan", view.readMileage("Sedan")));
        fleet.add(new SUV("SUV", view.readMileage("SUV")));
        fleet.add(new Truck("Truck", view.readMileage("Truck")));
        fleet.add(new Van("Van", view.readMileage("Van")));
        fleet.add(new Ambulance("Ambulance", view.readMileage("Ambulance")));

        // 4. Create Controller
        FleetController controller = new FleetController(fleet);

        // -------- Requirement 2 --------
        Vehicle urgent = controller.getMostUrgentVehicle();
        view.displayUrgentVehicle(urgent);

        // -------- Requirement 3 --------
        controller.sortByPurchasePriceDesc();
        view.displayVehiclesByPrice(controller.getFleet());

        // -------- Requirement 4 --------
        String category = view.askCategory();
        view.displayCategoryVehicles(
                category,
                controller.getVehiclesByCategory(category)
        );
    }
}
