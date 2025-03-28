package provaTest;
public abstract class Bebidas {
    protected String id;
    protected double capacitat;
    protected double preu;
    protected String marca;

    public Bebidas(String id, double capacitat, double preu, String marca) {
        this.id = id;
        this.capacitat = capacitat;
        this.preu = preu;
        this.marca = marca;
    }

    // Getters y setters
    public String getId() { return id; }
    public double getCapacitat() { return capacitat; }
    public double getPreu() { return preu; }
    public String getMarca() { return marca; }

    public void setId(String id) { this.id = id; }
    public void setCapacitat(double capacitat) { this.capacitat = capacitat; }
    public void setPreu(double preu) { this.preu = preu; }
    public void setMarca(String marca) { this.marca = marca; }
}
