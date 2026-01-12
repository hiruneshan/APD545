package ca.senecacollege.controllers;

import ca.senecacollege.models.Person;
import ca.senecacollege.models.Student;
import ca.senecacollege.views.SchoolView;



public class SchoolController {
    private SchoolView view;


    public SchoolController(SchoolView view) {
        this.view = view;
    }

    public void displayDetails(Person person){
        view.dispplayDetails(person.getClass().getSimpleName(), person.getName(), person.getAge(), person.getDetails());
    }

}
