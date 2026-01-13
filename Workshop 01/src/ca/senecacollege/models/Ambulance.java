package ca.senecacollege.models;

public class Ambulance extends SpecializedVehicles{
    public Ambulance(String name, int currentMilage) {
        super(name, 85000, currentMilage);
        this.fuelType = "Diesal";
        this.primaryFunction = "Emergency medical transport, life-saving";
        this.serviceInterval = 8000;
        this.maintainanceCost = 800.00;
    }

    @Override
    public String getCategory() {
        return "Specialized";
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
        return maintainanceCost;
    }
}
