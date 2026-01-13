package ca.senecacollege.application;

import ca.senecacollege.models.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public void main(){

        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> fleet = new ArrayList<>();

        System.out.println("Enter current mileage for Sedan: ");
        int sedanMileage = scan.nextInt();
        fleet.add(new Sedan("Sedan", sedanMileage));

        System.out.println("Enter current mileage for Truck: ");
        int truckMileage = scan.nextInt();
        fleet.add(new Truck("Truck", truckMileage));

        System.out.println("Enter current mileage for SUV: ");
        int SUVMileage = scan.nextInt();
        fleet.add(new SUV("SUV", SUVMileage));

        System.out.println("Enter current mileage for Van: ");
        int vanMileage = scan.nextInt();
        fleet.add(new Van("Van", vanMileage));

        System.out.println("Enter current mileage for Ambulance");
        int ambulanceMileage = scan.nextInt();
        fleet.add(new Ambulance("Ambulance", ambulanceMileage));

        Collections.sort(fleet);

        //get the urgent vehicle from the sorted array
        Vehicle urgent = fleet.get(0);
        System.out.println(urgent.getPrimaryFunction());
        System.out.println((urgent.getPurchasePrice()));
        System.out.println(urgent.getServiceInterval());
        System.out.println(urgent.getMaintenanceCost());




    }

}
