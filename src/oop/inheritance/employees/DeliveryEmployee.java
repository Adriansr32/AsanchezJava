package inheritance.employees;

import java.time.LocalDate;

/**
 * Class that represents a Delivery Employee.
 * This class extends from Employee class and adds a zone property and a fixed bonus for delivery employees.
 */
public class DeliveryEmployee extends Employee {
    private String zone;
    private static final double BONUS = 200.0;

    /**
     * Constructor for DeliveryEmployee class.
     * 
     * @param id the employee's ID
     * @param name the employee's name
     * @param lastName the employee's last name
     * @param birthDate the employee's birth date
     * @param salary the employee's salary
     * @param zone the employee's delivery zone
     */
    public DeliveryEmployee(String id, String name, String lastName, LocalDate birthDate, 
                           double salary, String zone) {
        super(id, name, lastName, birthDate, salary);
        this.zone = zone;
    }

    /**
     * Gets the employee's delivery zone.
     * 
     * @return the delivery zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the employee's delivery zone.
     * 
     * @param zone the new delivery zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * Determines if the delivery employee gets a bonus.
     * A delivery employee gets a bonus if they are under 25 years old and their zone is "zone 3".
     * 
     * @return true if the employee gets a bonus, false otherwise
     */
    @Override
    public boolean getBonus() {
        return getAge() < 25 && zone.equalsIgnoreCase("zone 3");
    }

    /**
     * Gets the bonus amount for delivery employees.
     * 
     * @return the fixed bonus amount
     */
    public static double getBonusAmount() {
        return BONUS;
    }
}