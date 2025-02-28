package herencia_AdriánSánchez;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleats {
    private String DNI;
    private String name;
    private String lastName;
    private LocalDate bornDate;
    private double salary;

    public Empleats(String DNI, String name, String lastName, LocalDate bornDate, double salary) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.salary = salary;
    }

    public String getDNI(){
        return DNI;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setDNI(String newValue) {
        this.DNI = newValue;
    }

    public void setName(String newValue) {
        this.name = newValue;
    }

    public void setLastName(String newValue) {
        this.lastName = newValue;
    }

    public void setBornDate(LocalDate newValue) {
        this.bornDate = newValue;
    }

    public void setSalary(double newValue) {
        this.salary = newValue;
    }

    public int calAge() {
        return Period.between(bornDate, LocalDate.now()).getYears();
    }
    @Override
    public String toString() {
        return "L'empleat " + name + " " + lastName + " amb el DNI " + DNI + " va néixer el " + bornDate + " i té " + calAge() + " anys.";
    }
    
    public abstract boolean plus();
}
