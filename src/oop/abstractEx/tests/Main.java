package abstractEx.tests;

import abstractEx.people.*;

/**
 * Main class that contains the main method to run the program.
 * Creates instances of Employee and Student classes and calls their methods.
 */
public class Main {
    /**
     * Main method that initializes Employee and Student objects and demonstrates their functionality.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an employee
        Employee emp = new Employee("John Doe", 50000.0);
        System.out.println("Employee Description: " + emp.getDescription());
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Create a student
        Student student = new Student("Jane Smith", "Computer Science");
        System.out.println("\nStudent Description: " + student.getDescription());
        System.out.println("Student Major: " + student.getMajor());

        // Demonstrate polymorphism
        Person[] people = new Person[2];
        people[0] = emp;
        people[1] = student;

        System.out.println("\nPolymorphic Descriptions:");
        for (Person person : people) {
            System.out.println(person.getDescription());
        }
    }
}