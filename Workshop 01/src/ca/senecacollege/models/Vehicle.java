package ca.senecacollege.models;

import ca.senecacollege.utility.IVehicleMaintenance;
import ca.senecacollege.utility.IVehicleOperations;

public abstract class Vehicle
        implements IVehicleMaintenance, IVehicleOperations, Comparable<Vehicle> {
    protected String name;
    protected double purchasePrice;
    protected int currentMilage;
    protected int serviceInterval;
    protected double maintainanceCost;
    protected String primaryFunction;
    protected String fuelType;

    public Vehicle(String name, double purchasePrice, int currentMilage){
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.currentMilage = currentMilage;
    }

    public abstract String getCategory();

    public int getCurrentMilage(){
        return currentMilage;
    }

    public double getPurchasePrice(){
        return purchasePrice;
    }

    public String toString(){
        return name + " - $" + purchasePrice;
    }


    public int compareTo(Vehicle other){
        int thisDistance = serviceInterval - (currentMilage % serviceInterval);
        if (thisDistance == serviceInterval){
            thisDistance = 0;
        }
        int otherDistance = other.serviceInterval - (other.currentMilage % other.serviceInterval);
        if (otherDistance == other.serviceInterval){
            otherDistance = 0;
        }

        return Integer.compare(thisDistance, otherDistance);
    }








}
