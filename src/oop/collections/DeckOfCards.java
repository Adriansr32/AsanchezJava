package collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Representa una baralla de cartes amb 4 pals i 12 cartes per pal.
 * Permet crear la baralla, barallar-la, repartir cartes i mostrar l'estat actual de la baralla.
 */
public class DeckOfCards {
    
    /**
     * La posició de la següent carta a repartir.
     */
    private int posCartaSeguent;
    
    /**
     * Array que conté totes les cartes de la baralla.
     */
    private Carta[] cartes;
    
    /**
     * Els noms dels pals de la baralla.
     */
    private final String[] PALS = {"Espases", "Copas", "Oros", "Bastos"};
    
    /**
     * El límit de cartes per cada pal (12 cartes).
     */
    private final int LIMIT_CARTA_PAL = 12;

    /**
     * Crea una nova baralla de cartes, la baralla i la deixa preparada per repartir.
     */
    public DeckOfCards() {
        this.posCartaSeguent = 0;
        this.cartes = new Carta[LIMIT_CARTA_PAL * PALS.length];
        this.crearBaralla();
        this.barallar();
    }

    /**
     * Baralla les cartes de la baralla utilitzant l'algorisme de barallat de la classe {@link Collections}.
     */
    public void barallar() {
        List<Carta> listaCartes = new ArrayList<>();
        for (Carta carta : cartes) {
            listaCartes.add(carta);
        }
        Collections.shuffle(listaCartes);
        cartes = listaCartes.toArray(new Carta[0]);
    }

    /**
     * Obté la següent carta de la baralla.
     * 
     * @return La següent carta a repartir, o null si no queden més cartes.
     */
    public Carta cartaSeguent() {
        if (this.posCartaSeguent < cartes.length) {
            return this.cartes[this.posCartaSeguent++];
        } else {
            System.out.println("No hi ha més cartes per repartir.");
            return null;
        }
    }

    /**
     * Retorna el nombre de cartes disponibles per repartir.
     * 
     * @return El nombre de cartes disponibles.
     */
    public int cartesDisponibles() {
        return this.cartes.length - this.posCartaSeguent;
    }

    /**
     * Reparteix un nombre específic de cartes.
     * 
     * @param num El nombre de cartes a repartir.
     * @return Un array amb les cartes repartides.
     */
    public Carta[] donarCartes(int num) {
        if (cartesDisponibles() < num) {
            System.out.println("No hi ha prou cartes per repartir.");
            return new Carta[0];
        }
        Carta[] cartesRepartides = new Carta[num];
        for (int i = 0; i < num; i++) {
            cartesRepartides[i] = this.cartaSeguent();
        }
        return cartesRepartides;
    }

    /**
     * Mostra les cartes que han estat repartides fins al moment.
     */
    public void cartesRepartides() {
        if (this.posCartaSeguent == 0) {
            System.out.println("No s'han repartit cartes.");
        } else {
            System.out.println("Cartes repartides:");
            for (int i = 0; i < this.posCartaSeguent; i++) {
                System.out.println(this.cartes[i]);
            }
        }
    }

    /**
     * Mostra les cartes que encara queden per repartir.
     */
    public void mostrarBaralla() {
        System.out.println("Cartes que queden per repartir:");
        for (int i = this.posCartaSeguent; i < cartes.length; i++) {
            System.out.println(cartes[i]);
        }
    }

    /**
     * Crea la baralla de cartes amb els 4 pals i 12 cartes per pal.
     */
    private void crearBaralla() {
        int index = 0;
        for (String pal : this.PALS) {
            for (int i = 1; i <= LIMIT_CARTA_PAL; i++) {
                this.cartes[index++] = new Carta(i, pal);
            }
        }
    }
}
