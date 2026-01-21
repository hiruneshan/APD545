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
package ca.senecacollege.application;

import ca.senecacollege.controllers.FleetController;
import ca.senecacollege.views.FleetView;

public class App {
    public static void main(String[] args) {
        // Initialize the View
        FleetView view = new FleetView();

        // Initialize the Controller and pass it the View
        FleetController controller = new FleetController(view);

        // Start the application logic
        controller.runSystem();
    }
}