package herencia_AdriánSánchez;

import java.time.*;

/**
 * Classe que representa un empleat de tipus Comercial.
 * Aquesta classe hereta de la classe Empleats i afegeix una propietat de comissió i un plus fix per als comercials.
 */
public class Comercial extends Empleats {
    
    private double commission;
    public final double PLUS = 200;

    /**
     * Constructor per crear un objecte Comercial amb el DNI, nom, cognom, data de naixement, salari i comissió.
     * 
     * @param DNI el DNI de l'empleat comercial
     * @param name el nom de l'empleat comercial
     * @param lastName els cognoms de l'empleat comercial
     * @param bornDate la data de naixement de l'empleat comercial
     * @param salary el salari de l'empleat comercial
     * @param commission la comissió de l'empleat comercial
     */
    public Comercial(String DNI, String name, String lastName, LocalDate bornDate, double salary, double commission) {
        super(DNI, name, lastName, bornDate, salary);
        this.commission = commission;
    }

    /**
     * Obté el valor de la comissió de l'empleat comercial.
     * 
     * @return la comissió de l'empleat comercial
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Estableix el valor de la comissió de l'empleat comercial.
     * 
     * @param newValue el nou valor per a la comissió
     */
    public void setCommission(double newValue) {
        this.commission = newValue;
    }

    /**
     * Retorna una representació en cadena de l'empleat comercial, incloent la informació de l'empleat 
     * i la comissió associada.
     * 
     * @return una cadena amb la informació de l'empleat comercial
     */
    @Override
    public String toString() {
        return super.toString() + " comissió: " + commission;
    }

    /**
     * Determina si l'empleat comercial té dret a un plus. Un comercial pot rebre un plus si té més de 30 anys 
     * i una comissió superior a 200.
     * 
     * @return true si l'empleat té dret al plus, false en cas contrari
     */
    @Override
    public boolean plus() {
        if ((calAge() > 30) && (commission > 200)) {
            double p = getSalary() + 200;
            System.out.println("Se le afegit un plus al treballador: " + getName());
            setSalary(p);
            return true;
        }
        return false;
    }
}
