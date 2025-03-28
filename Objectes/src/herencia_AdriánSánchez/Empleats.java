package herencia_AdriánSánchez;

import java.time.LocalDate;
import java.time.Period;

/**
 * Classe abstracta que representa un empleat.
 * Aquesta classe conté informació personal com el DNI, nom, cognom, data de naixement i salari.
 * També inclou mètodes per obtenir i establir aquests valors, així com per calcular l'edat.
 */
abstract class Empleats {
    
    private String DNI;
    private String name;
    private String lastName;
    private LocalDate bornDate;
    private double salary;

    /**
     * Constructor de la classe Empleats.
     * Inicialitza els atributs de l'empleat amb els valors proporcionats.
     * 
     * @param DNI el DNI de l'empleat
     * @param name el nom de l'empleat
     * @param lastName els cognoms de l'empleat
     * @param bornDate la data de naixement de l'empleat
     * @param salary el salari de l'empleat
     */
    public Empleats(String DNI, String name, String lastName, LocalDate bornDate, double salary) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.salary = salary;
    }

    /**
     * Obté el DNI de l'empleat.
     * 
     * @return el DNI de l'empleat
     */
    public String getDNI(){
        return DNI;
    }

    /**
     * Obté el nom de l'empleat.
     * 
     * @return el nom de l'empleat
     */
    public String getName() {
        return name;
    }

    /**
     * Obté els cognoms de l'empleat.
     * 
     * @return els cognoms de l'empleat
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Obté la data de naixement de l'empleat.
     * 
     * @return la data de naixement de l'empleat
     */
    public LocalDate getBornDate() {
        return bornDate;
    }

    /**
     * Obté el salari de l'empleat.
     * 
     * @return el salari de l'empleat
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Estableix el DNI de l'empleat.
     * 
     * @param newValue el nou valor per al DNI
     */
    public void setDNI(String newValue) {
        this.DNI = newValue;
    }

    /**
     * Estableix el nom de l'empleat.
     * 
     * @param newValue el nou valor per al nom
     */
    public void setName(String newValue) {
        this.name = newValue;
    }

    /**
     * Estableix els cognoms de l'empleat.
     * 
     * @param newValue el nou valor per als cognoms
     */
    public void setLastName(String newValue) {
        this.lastName = newValue;
    }

    /**
     * Estableix la data de naixement de l'empleat.
     * 
     * @param newValue la nova data de naixement
     */
    public void setBornDate(LocalDate newValue) {
        this.bornDate = newValue;
    }

    /**
     * Estableix el salari de l'empleat.
     * 
     * @param newValue el nou valor per al salari
     */
    public void setSalary(double newValue) {
        this.salary = newValue;
    }

    /**
     * Calcula l'edat de l'empleat basant-se en la seva data de naixement.
     * 
     * @return l'edat de l'empleat en anys
     */
    public int calAge() {
        return Period.between(bornDate, LocalDate.now()).getYears();
    }

    /**
     * Retorna una representació en cadena de l'empleat, incloent nom, cognoms, DNI, data de naixement i edat.
     * 
     * @return una cadena amb la informació de l'empleat
     */
    @Override
    public String toString() {
        return "L'empleat " + name + " " + lastName + " amb el DNI " + DNI + " va néixer el " + bornDate + " i té " + calAge() + " anys.";
    }

    /**
     * Mètode abstracte per determinar si un empleat té dret a un plus.
     * Les subclasses de la classe Empleats han de proporcionar una implementació d'aquest mètode.
     * 
     * @return true si l'empleat té dret a un plus, false en cas contrari
     */
    public abstract boolean plus();
}
