package ca.senecacollege.models;

public class Teacher extends Staff{
    private String course;

    public Teacher(String name, int age, String department, String course) {
        super(name, age, department);
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "";
    }

    @Override
    public void performRole() {

    }
}
