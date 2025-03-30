package inheritance.tests;

import java.time.LocalDate;

import inheritance.employees.*;

/**
 * Test class that serves as an entry point to test the creation and behavior of DeliveryEmployee
 * and SalesEmployee objects. It instantiates various employees and calculates if they are
 * eligible for a bonus according to the conditions specified in each class.
 */
public class TestEmployee {
    public static void main(String[] args) {
        // Create a delivery employee
        DeliveryEmployee delivery1 = new DeliveryEmployee(
            "12345678A",
            "John",
            "Smith",
            LocalDate.of(2000, 1, 1),
            1500.0,
            "zone 3"
        );

        // Create another delivery employee
        DeliveryEmployee delivery2 = new DeliveryEmployee(
            "87654321B",
            "Alice",
            "Johnson",
            LocalDate.of(1995, 6, 15),
            1600.0,
            "zone 2"
        );

        // Create a sales employee
        SalesEmployee sales1 = new SalesEmployee(
            "11223344C",
            "Michael",
            "Brown",
            LocalDate.of(1990, 3, 20),
            2000.0,
            2500.0
        );

        // Create another sales employee
        SalesEmployee sales2 = new SalesEmployee(
            "44332211D",
            "Sarah",
            "Davis",
            LocalDate.of(1985, 12, 10),
            2200.0,
            1800.0
        );

        // Test delivery employees
        System.out.println("Testing Delivery Employees:\n");
        testEmployee(delivery1);
        testEmployee(delivery2);

        // Test sales employees
        System.out.println("\nTesting Sales Employees:\n");
        testEmployee(sales1);
        testEmployee(sales2);
    }

    /**
     * Tests an employee by printing their information and bonus eligibility.
     * 
     * @param employee the employee to test
     */
    private static void testEmployee(Employee employee) {
        System.out.println("Employee: " + employee.getName() + " " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: $" + employee.getSalary());
        
        if (employee instanceof DeliveryEmployee) {
            DeliveryEmployee delivery = (DeliveryEmployee) employee;
            System.out.println("Zone: " + delivery.getZone());
            System.out.println("Eligible for bonus: " + delivery.getBonus());
            if (delivery.getBonus()) {
                System.out.println("Bonus amount: $" + DeliveryEmployee.getBonusAmount());
            }
        } else if (employee instanceof SalesEmployee) {
            SalesEmployee sales = (SalesEmployee) employee;
            System.out.println("Commission: $" + sales.getCommission());
            System.out.println("Eligible for bonus: " + sales.getBonus());
            if (sales.getBonus()) {
                System.out.println("Bonus amount: $" + SalesEmployee.getBonusAmount());
            }
        }
        System.out.println();
    }
}