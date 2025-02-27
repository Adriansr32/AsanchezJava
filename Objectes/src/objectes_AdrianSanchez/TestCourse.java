package objectes_AdrianSanchez;

/**
 * Classe de prova per a la classe {@link Course}.
 * Crea un curs amb el nom del curs i el nom del professor especificats,
 * i imprimeix la seva representació en cadena.
 */
public class TestCourse {

    /**
     * Mètode principal que crea un curs i imprimeix la seva representació en cadena.
     * 
     * @param args Paràmetres de la línia d'ordres (no utilitzats en aquest cas).
     */
    public static void main(String[] args) {
        
        // Creació d'un curs
        Course Course1 = new Course("M02 Bases de Dades", "Jordi Torres");
        
        // Imprimir la representació en cadena del curs
        System.out.println(Course1.formatCadena());
    }
}
