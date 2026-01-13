package ca.senecacollege.models;

public class Truck extends CommercialVehicles{
    public Truck(String name, double purchasePrice, int currentMilage) {
        super(name, purchasePrice, currentMilage);
    }

    @Override
    public String getCategory() {
        return "";
    }

    @Override
    public String getPrimaryFunction() {
        return "";
    }

    @Override
    public String getFuelType() {
        return "";
    }

    @Override
    public int getServiceInterval() {
        return 0;
    }

    @Override
    public double getMaintenanceCost() {
        return 0;
    }
}
