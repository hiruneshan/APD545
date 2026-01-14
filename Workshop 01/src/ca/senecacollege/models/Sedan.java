package ca.senecacollege.models;

public class Sedan extends PassengerVehicles{

    public Sedan(String name, int milage) {
        super(name, 28500, milage);

        this.fuelType = "Gasoline";
        this.primaryFunction = "Executive transportation, client visits";
        this.serviceInterval = 10000;
        this.maintenanceCost = 350.00;
    }
    @Override
    public String getCategory()
    {
        return "Economy";
    }

    // 2. Fixing methods from IVehicleMaintenance
    @Override
    public int getServiceInterval() {
        return this.serviceInterval;
    }

    @Override
    public double getMaintenanceCost() {
        return this.maintenanceCost;
    }

    @Override
    public String getPrimaryFunction() {
        return this.primaryFunction;
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }
}
