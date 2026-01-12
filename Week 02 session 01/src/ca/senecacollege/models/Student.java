package ca.senecacollege.models;

import ca.senecacollege.utility.IPersonRole;

public class Student extends Person implements IPersonRole {

    private String studentID;
    @Override
    public String getDetails() {
        return "";
    }

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public void performRole() {

    }
}
