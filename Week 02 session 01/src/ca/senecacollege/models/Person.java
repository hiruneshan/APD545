package ca.senecacollege.models;

public abstract class Person {
    private String name;
    private int age;

    public void greet(){
        System.out.println("Hello my name is " + name);
    }
    public abstract String getDetails();

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
