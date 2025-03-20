package herencia_AdriánSánchez;

import java.time.*;

/**
 * Classe que serveix com a punt d'entrada per provar la creació i el comportament dels objectes 
 * de les classes `Repartidor` i `Comercial`. S'instancien diversos empleats de tipus Repartidor 
 * i Comercial i es calcula si tenen dret a un plus segons les condicions especificades a cada classe.
 */
public class TestEmpleats {

    /**
     * Mètode principal que crea instàncies de `Repartidor` i `Comercial`, 
     * aplica el mètode `plus()` a cada empleat i imprimeix la informació dels mateixos.
     * 
     * @param args arguments de la línia de comandes (no utilitzats en aquest cas)
     */
	public static void main(String[] args) {
        // Creació d'objectes Repartidors
        Repartidor repartidor1 = new Repartidor("12345678A", "Carlos", "Pérez", LocalDate.of(1990, 3, 10), 1800.0, 1);
        Repartidor repartidor2 = new Repartidor("87654321B", "Laura", "Gómez", LocalDate.of(1995, 7, 22), 1900.0, 2);
        Repartidor repartidor3 = new Repartidor("11223344C", "David", "Martínez", LocalDate.of(1988, 5, 5), 1850.0, 3);
        Repartidor repartidor4 = new Repartidor("44332211D", "Sofía", "López", LocalDate.of(1992, 11, 30), 1750.0, 4);
        
        // Creació d'objectes Comercials
        Comercial comercial1 = new Comercial("55667788E", "Alejandro", "Ruiz", LocalDate.of(1985, 4, 18), 2500.0, 300.0);
        Comercial comercial2 = new Comercial("99887766F", "Marina", "Fernández", LocalDate.of(1993, 9, 14), 2600.0, 350.0);
        Comercial comercial3 = new Comercial("66778899G", "Raúl", "Sánchez", LocalDate.of(1980, 1, 25), 2700.0, 400.0);
        Comercial comercial4 = new Comercial("55443322H", "Elena", "Díaz", LocalDate.of(1987, 6, 7), 2550.0, 320.0);
        
        // Aplicació del mètode plus() als repartidors
        repartidor1.plus();
        repartidor2.plus();
        repartidor3.plus();
        repartidor4.plus();
        
        // Aplicació del mètode plus() als comercials
        comercial1.plus();
        comercial2.plus();
        comercial3.plus();
        comercial4.plus();
        
        // Imprimir la informació dels repartidors
        System.out.println(repartidor1);
        System.out.println(repartidor2);
        System.out.println(repartidor3);
        System.out.println(repartidor4);

        // Imprimir la informació dels comercials
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(comercial3);
        System.out.println(comercial4);
	}
}
