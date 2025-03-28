package provaTest;
public class Refrescos extends Bebidas {
    private double percentatgeSucre;
    private boolean promocio;

    public Refrescos(String id, double capacitat, double preu, String marca, double percentatgeSucre, boolean promocio) {
        super(id, capacitat, preu, marca);
        this.percentatgeSucre = percentatgeSucre;
        this.promocio = promocio;
    }

    // Getters y setters
    public double getPercentatgeSucre() { return percentatgeSucre; }
    public boolean getPromocio() { return promocio; }

    public void setPercentatgeSucre(double percentatgeSucre) { this.percentatgeSucre = percentatgeSucre; }
    public void setPromocio(boolean promocio) { this.promocio = promocio; }

    // Si tiene promoción, aplica un descuento del 10% sobre el precio
    public double calcularPreuFinal() {
        return promocio ? preu * 0.9 : preu;
    }
}
