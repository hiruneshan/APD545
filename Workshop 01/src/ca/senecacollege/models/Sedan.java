package ca.senecacollege.models;

public class Sedan extends PassengerVehicles{

    public Sedan(String name, double price, int milage, String fuelType, String PrimaryFunction, int serviceInterval) {
        super(name, price, milage);
    }
    @Override
    public String getCategory() {
        return "Passenger Vehicle: Sedan";
    }

    // 2. Fixing methods from IVehicleMaintenance
    @Override
    public int getServiceInterval() {
        return this.serviceInterval;
    }

    @Override
    public double getMaintenanceCost() {
        return this.maintainanceCost;
    }

    // 3. Fixing methods from IVehicleOperations
    @Override
    public String getPrimaryFunction() {
        return this.primaryFunction;
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }
}
