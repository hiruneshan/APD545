package ca.senecacollege.models;

import ca.senecacollege.utility.IVehicleMaintenance;
import ca.senecacollege.utility.IVehicleOperations;

public abstract class Vehicle
        implements IVehicleMaintenance, IVehicleOperations, Comparable<Vehicle> {
    protected String name;
    protected double purchasePrice;
    protected int currentMileage;
    protected int serviceInterval;
    protected double maintenanceCost;
    protected String primaryFunction;
    protected String fuelType;

    public Vehicle(String name, double purchasePrice, int currentMilage){
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.currentMileage = currentMilage;
    }

    public abstract String getCategory();

    public int getCurrentMileage(){
        return currentMileage;
    }

    public double getPurchasePrice(){
        return purchasePrice;
    }

    public String toString(){
        return name + " - $" + String.format("%,.1f", purchasePrice);
    }

    public String getName(){
        return name;
    }

    public int compareTo(Vehicle other){
        int thisDistance = serviceInterval - (currentMileage % serviceInterval);
        if (thisDistance == serviceInterval){
            thisDistance = 0;
        }
        int otherDistance = other.serviceInterval - (other.currentMileage % other.serviceInterval);
        if (otherDistance == other.serviceInterval){
            otherDistance = 0;
        }

        return Integer.compare(thisDistance, otherDistance);
    }








}
