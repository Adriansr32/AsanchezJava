package abstractEx.people;
/**
 * Class that represents an employee, extending the abstract Person class.
 */
public class Employee extends Person {
    private double salary;

    /**
     * Constructor for Employee class.
     * @param name The name of the employee
     * @param salary The salary of the employee
     */
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    /**
     * Gets the employee's description.
     * @return A string containing the employee's name and salary
     */
    @Override
    public String getDescription() {
        return String.format("An employee with name %s and salary $%.2f", getName(), salary);
    }

    /**
     * Gets the employee's salary.
     * @return The salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     * @param salary The new salary for the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}