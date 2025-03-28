package provaTest;
public class Aigua extends Bebidas {
    private String origen;

    public Aigua(String id, double capacitat, double preu, String marca, String origen) {
        super(id, capacitat, preu, marca);
        this.origen = origen;
    }

    // Getter y setter
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
}
