package ca.senecacollege.models;

import ca.senecacollege.utility.IPersonRole;

public abstract class Staff extends Person implements IPersonRole {

    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void attendMeeting(){

    }
}
