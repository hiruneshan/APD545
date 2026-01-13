package ca.senecacollege.models;

public class SUV extends Vehicle{
    public SUV(String name, double price, int milage, String fuelType, String PrimaryFunction, int serviceInterval) {
        super(name, price, milage);

        this.fuelType = fuelType;
        this.primaryFunction = primaryFunction;
        this.serviceInterval = serviceInterval;
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
