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

public class SUV extends PassengerVehicles{
    public SUV(String name, int milage) {
        super(name,45000 , milage);

        this.fuelType = "Hybrid";
        this.primaryFunction = "Family transport, off-road capability";
        this.serviceInterval = 12000;
        this.maintenanceCost = 450.00;
    }
    @Override
    public String getCategory() {
        return "Premium";
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
