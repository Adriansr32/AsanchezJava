package objectes_AdrianSanchez;

class Carta {
    private int numero;
    private String pal;

    public Carta(int numero, String pal) {
        this.numero = numero;
        this.pal = pal;
    }

    @Override
    public String toString() {
        return numero + " de " + pal;
    }
}
