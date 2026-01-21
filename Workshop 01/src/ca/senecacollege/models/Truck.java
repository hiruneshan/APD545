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

public class Truck extends CommercialVehicles{
    public Truck(String name, int currentMilage) {
        super(name, 62000, currentMilage);
        this.fuelType = "Diesel";
        this.primaryFunction = "Heavy cargo, long-distance hauling";
        this.serviceInterval = 15000;
        this.maintenanceCost = 600.00;
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
