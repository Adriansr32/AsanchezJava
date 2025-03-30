package inheritance.employees;

import java.time.LocalDate;

/**
 * Class that represents a Sales Employee.
 * This class extends from Employee class and adds a commission property and a fixed bonus for sales employees.
 */
public class SalesEmployee extends Employee {
    private double commission;
    private static final double BONUS = 300.0;

    /**
     * Constructor for SalesEmployee class.
     * 
     * @param id the employee's ID
     * @param name the employee's name
     * @param lastName the employee's last name
     * @param birthDate the employee's birth date
     * @param salary the employee's base salary
     * @param commission the employee's commission percentage
     */
    public SalesEmployee(String id, String name, String lastName, LocalDate birthDate, 
                        double salary, double commission) {
        super(id, name, lastName, birthDate, salary);
        this.commission = commission;
    }

    /**
     * Gets the employee's commission.
     * 
     * @return the commission percentage
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the employee's commission.
     * 
     * @param commission the new commission percentage
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    /**
     * Determines if the sales employee gets a bonus.
     * A sales employee gets a bonus if they are over 30 years old and their commission is over 2000.
     * 
     * @return true if the employee gets a bonus, false otherwise
     */
    @Override
    public boolean getBonus() {
        return getAge() > 30 && commission > 2000;
    }

    /**
     * Gets the bonus amount for sales employees.
     * 
     * @return the fixed bonus amount
     */
    public static double getBonusAmount() {
        return BONUS;
    }
}