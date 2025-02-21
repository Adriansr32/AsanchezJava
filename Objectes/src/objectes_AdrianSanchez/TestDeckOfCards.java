package objectes_AdrianSanchez;

public class TestDeckOfCards {
    public static void main(String[] args) {
    	DeckOfCards baralla = new DeckOfCards();

        baralla.mostrarBaralla();

        System.out.println("\nRepartint 5 cartes...");
        baralla.donarCartes(5);

        baralla.cartesRepartides();

        System.out.println("\nCartes que queden per repartir després de repartir 5 cartes:");
        baralla.mostrarBaralla();

        System.out.println("\nCartes disponibles: " + baralla.cartesDisponibles());

        System.out.println("\nRepartint 10 cartes...");
        baralla.donarCartes(10);

        baralla.cartesRepartides();

        System.out.println("\nCartes que queden per repartir:");
        baralla.mostrarBaralla();
        System.out.println("\nCartes disponibles: " + baralla.cartesDisponibles());
    }
}
