package collections;

/**
 * Representa una carta de la baralla amb un número i un pal.
 * Proporciona un mètode per obtenir una representació en cadena de la carta.
 */
class Carta {

    /**
     * El número de la carta (de 1 a 12).
     */
    private int numero;

    /**
     * El pal de la carta (Espases, Copas, Oros, Bastos).
     */
    private String pal;

    /**
     * Crea una carta amb el número i el pal especificats.
     * 
     * @param numero El número de la carta.
     * @param pal El pal de la carta.
     */
    public Carta(int numero, String pal) {
        this.numero = numero;
        this.pal = pal;
    }

    /**
     * Retorna una representació en cadena de la carta, mostrant el número i el pal.
     * 
     * @return Una cadena amb el número i el pal de la carta.
     */
    @Override
    public String toString() {
        return numero + " de " + pal;
    }
}
