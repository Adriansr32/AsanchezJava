package objectes_AdrianSanchez;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DeckOfCards {
    private int posCartaSeguent;
    private Carta[] cartes;
    private final String[] PALS = {"Espases", "Copas", "Oros", "Bastos"};
    private final int LIMIT_CARTA_PAL = 12;

    public DeckOfCards() {
        this.posCartaSeguent = 0;
        this.cartes = new Carta[LIMIT_CARTA_PAL * PALS.length];
        this.crearBaralla();
        this.barallar();
    }

    public void barallar() {
        List<Carta> listaCartes = new ArrayList<>();
        for (Carta carta : cartes) {
            listaCartes.add(carta);
        }
        Collections.shuffle(listaCartes);
        cartes = listaCartes.toArray(new Carta[0]);
    }

    public Carta cartaSeguent() {
        if (this.posCartaSeguent < cartes.length) {
            return this.cartes[this.posCartaSeguent++];
        } else {
            System.out.println("No hi ha més cartes per repartir.");
            return null;
        }
    }

    public int cartesDisponibles() {
        return this.cartes.length - this.posCartaSeguent;
    }

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

    public void mostrarBaralla() {
        System.out.println("Cartes que queden per repartir:");
        for (int i = this.posCartaSeguent; i < cartes.length; i++) {
            System.out.println(cartes[i]);
        }
    }

    private void crearBaralla() {
        int index = 0;
        for (String pal : this.PALS) {
            for (int i = 1; i <= LIMIT_CARTA_PAL; i++) {
                this.cartes[index++] = new Carta(i, pal);
            }
        }
    }
}
