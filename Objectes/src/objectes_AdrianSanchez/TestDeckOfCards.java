package objectes_AdrianSanchez;

/**
 * Classe de prova per a la classe {@link DeckOfCards}.
 * Realitza operacions com mostrar la baralla, repartir cartes i mostrar l'estat de la baralla.
 */
public class TestDeckOfCards {

    /**
     * Mètode principal que crea una baralla, reparteix cartes i mostra l'estat de la baralla.
     * 
     * @param args Paràmetres de la línia d'ordres (no utilitzats en aquest cas).
     */
    public static void main(String[] args) {
        // Crear una nova baralla de cartes
        DeckOfCards baralla = new DeckOfCards();

        // Mostrar les cartes que queden per repartir
        baralla.mostrarBaralla();

        System.out.println("\nRepartint 5 cartes...");
        // Repartir 5 cartes
        baralla.donarCartes(5);

        // Mostrar les cartes que s'han repartit
        baralla.cartesRepartides();

        System.out.println("\nCartes que queden per repartir després de repartir 5 cartes:");
        // Mostrar les cartes que queden per repartir
        baralla.mostrarBaralla();

        System.out.println("\nCartes disponibles: " + baralla.cartesDisponibles());

        System.out.println("\nRepartint 10 cartes...");
        // Repartir 10 cartes més
        baralla.donarCartes(10);

        // Mostrar les cartes que s'han repartit
        baralla.cartesRepartides();

        System.out.println("\nCartes que queden per repartir:");
        // Mostrar les cartes restants
        baralla.mostrarBaralla();
        
        // Mostrar el nombre de cartes disponibles
        System.out.println("\nCartes disponibles: " + baralla.cartesDisponibles());
    }
}
