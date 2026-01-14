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
