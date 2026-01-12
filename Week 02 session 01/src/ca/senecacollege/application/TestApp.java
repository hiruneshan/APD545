package ca.senecacollege.application;

import ca.senecacollege.controllers.SchoolController;
import ca.senecacollege.models.Student;
import ca.senecacollege.models.Teacher;
import ca.senecacollege.views.SchoolView;

import java.util.Scanner;

public class TestApp {
    static void main() {
        SchoolView view = new SchoolView();
        // controller
        SchoolController controller = new SchoolController(view);

        // initalize the models
        Student st = new Student("Alice", 20, "A12345");
        Teacher teacher =  new Teacher("Mike", 35,"IT", "APS");

        controller.displayDetails(st);
        controller.displayDetails(teacher);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int value = scan.nextInt();

        double dvalue = scan.nextDouble(); // have to use a if else or try catch to know the users input whether is is double or what it is
        String name = scan.nextLine(); // uses the \n here otherwise next() will take the rest in the buffer

    }
}
