package ca.senecacollege.app;

public abstract class Employee extends Person{
    Employee() {
        // cannot have super() here because this() also constructor call so goes to that cons
        this("Overloaded Constructor");
        System.out.println("Employee object has been created");
    }

    public abstract void calculateSalary(); // this will be an abstract function but then the class should also be a an abstract class
    public Employee(String s){
        System.out.println(s);
    }

}
