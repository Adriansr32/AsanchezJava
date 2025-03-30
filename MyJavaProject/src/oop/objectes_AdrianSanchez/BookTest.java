package objectes_AdrianSanchez;

import education.*;

/**
 * Classe de prova per a la classe {@link Book}.
 * Crea tres llibres amb diferents atributs i els imprimeix a la consola.
 * També compara els llibres per determinar quin té més pàgines.
 */
public class BookTest {
    
    /**
     * Mètode principal que crea tres llibres, els imprimeix i determina quin llibre té més pàgines.
     * 
     * @param args Paràmetres de la línia d'ordres (no utilitzats en aquest cas).
     */
    public static void main(String[] args) {
        
        // Creació dels llibres
        Book Book1 = new Book("978-84-376-0494-7", "Hola test", "Adios test", 69);
        Book Book2 = new Book("978-84-376-0494-8", "Hola test1", "Adios test1", 26);
        Book Book3 = new Book("978-84-376-0494-9", "Hola test2", "Adios test2", 106);
        
        // Imprimir informació dels llibres
        System.out.println(Book1);
        System.out.println(Book2);
        System.out.println(Book3);
        
        // Inicialització del llibre amb més pàgines
        Book BigBook = Book1;

        // Compara el nombre de pàgines dels llibres per determinar el que en té més
        if (Book2.getPageCount() > BigBook.getPageCount()) {
            BigBook = Book2;
        }
        if (Book3.getPageCount() > BigBook.getPageCount()) {
            BigBook = Book3;
        }

        // Imprimir el llibre amb més pàgines
        System.out.println("El llibre amb més pàgines és: " + BigBook.getTitle() + 
                           " amb " + BigBook.getPageCount() + " pàgines.");
    }
}
