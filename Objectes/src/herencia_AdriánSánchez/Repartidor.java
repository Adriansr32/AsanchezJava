package herencia_AdriánSánchez;

import java.time.*;

/**
 * Classe que representa un empleat de tipus Repartidor.
 * Aquesta classe hereta de la classe Empleats i afegeix una propietat de zona i un plus fix per als repartidors.
 */
public class Repartidor extends Empleats {
    
    private int zone;
    public final double PLUS = 100;

    /**
     * Constructor per crear un objecte Repartidor amb el DNI, nom, cognom, data de naixement, salari i zona.
     * 
     * @param DNI el DNI de l'empleat repartidor
     * @param name el nom de l'empleat repartidor
     * @param lastName els cognoms de l'empleat repartidor
     * @param bornDate la data de naixement de l'empleat repartidor
     * @param salary el salari de l'empleat repartidor
     * @param zone la zona a la qual està assignat el repartidor
     */
    public Repartidor(String DNI, String name, String lastName, LocalDate bornDate, double salary, int zone) {
        super(DNI, name, lastName, bornDate, salary);
        this.zone = zone;
    }

    /**
     * Obté el valor de la zona assignada a l'empleat repartidor.
     * 
     * @return la zona de l'empleat repartidor
     */
    public int getZone() {
        return zone;
    }

    /**
     * Estableix el valor de la zona assignada a l'empleat repartidor.
     * 
     * @param newValue la nova zona assignada al repartidor
     */
    public void setZone(int newValue) {
        this.zone = newValue;
    }

    /**
     * Retorna una representació en cadena de l'empleat repartidor, incloent la informació de l'empleat 
     * i la zona a la qual està assignat.
     * 
     * @return una cadena amb la informació de l'empleat repartidor
     */
    @Override
    public String toString() {
        return super.toString() + " zona: " + zone;
    }

    /**
     * Determina si l'empleat repartidor té dret a un plus. Un repartidor pot rebre un plus si té menys de 25 anys 
     * i està assignat a la zona 5.
     * 
     * @return true si l'empleat té dret al plus, false en cas contrari
     */
    @Override
    public boolean plus() {
        if ((calAge() < 25) && (zone == 5)) {
            double p = getSalary() + PLUS;
            setSalary(p);
            System.out.print("Se le afegit un plus al treballador: " + getName());
            return true;
        }
        return false;
    }
}
