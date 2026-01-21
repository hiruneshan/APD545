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
package ca.senecacollege.models;

public class Van extends CommercialVehicles{
    public Van(String name, int currentMilage) {
        super(name, 38000, currentMilage);
        this.fuelType = "Gasoline";
        this.primaryFunction = "Passenger group transport, deliveries";
        this.serviceInterval = 10000;
        this.maintenanceCost = 400.00;
    }

    @Override
    public String getCategory() {
        return "Commercial";
    }

    @Override
    public String getPrimaryFunction() {
        return primaryFunction;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public int getServiceInterval() {
        return serviceInterval;
    }

    @Override
    public double getMaintenanceCost() {
        return maintenanceCost;
    }
}
