package ca.senecacollege.models;

import ca.senecacollege.utility.IVehicleMaintenance;
import ca.senecacollege.utility.IVehicleOperations;

public abstract class Vehicle implements IVehicleMaintenance, IVehicleOperations {
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

    public void getCurrentMilage(){

    }

    public double getPurchasePrice(){
        return purchasePrice;
    }

    public String toString(){
        return
    }


    public int compareTo(Vehicle other){

    }








}
