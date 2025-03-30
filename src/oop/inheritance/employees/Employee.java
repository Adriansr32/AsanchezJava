package inheritance.employees;

import java.time.LocalDate;
import java.time.Period;

/**
 * Abstract class that represents an employee.
 * This class contains personal information such as ID, name, surname, birth date and salary.
 * It also includes methods to get and set these values, as well as to calculate age.
 */
public abstract class Employee {
    
    private String id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private double salary;

    /**
     * Constructor for the Employee class.
     * Initializes the employee's attributes with the provided values.
     * 
     * @param id the employee's ID
     * @param name the employee's name
     * @param lastName the employee's last name
     * @param birthDate the employee's birth date
     * @param salary the employee's salary
     */
    public Employee(String id, String name, String lastName, LocalDate birthDate, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    /**
     * Gets the employee's ID.
     * 
     * @return the employee's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the employee's name.
     * 
     * @return the employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the employee's last name.
     * 
     * @return the employee's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the employee's birth date.
     * 
     * @return the employee's birth date
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Gets the employee's salary.
     * 
     * @return the employee's salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     * 
     * @param salary the new salary for the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Calculates the employee's age based on their birth date.
     * 
     * @return the employee's age in years
     */
    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    /**
     * Abstract method to determine if the employee gets a bonus.
     * Must be implemented by subclasses.
     * 
     * @return true if the employee gets a bonus, false otherwise
     */
    public abstract boolean getBonus();
}