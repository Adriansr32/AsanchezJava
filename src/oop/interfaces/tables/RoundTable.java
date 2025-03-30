package interfaces.tables;

import interfaces.TableCalculations;

/**
 * Clase que representa una mesa redonda que implementa la interfaz TableCalculations.
 * Contiene los métodos para calcular el área de la mesa y el número de comensales.
 */
public class RoundTable implements TableCalculations {
    // Atributos de la clase RoundTable
    private String material; // Material de la mesa (vidrio, madera, metal)
    private boolean regulable; // Indica si la mesa es regulable en altura
    private double height; // Altura de la mesa (0 si es regulable)
    private double diameter; // Diámetro de la mesa

    /**
     * Constructor para crear una mesa redonda con los detalles especificados.
     * @param material El material de la mesa (vidrio, madera, metal).
     * @param regulable Indica si la mesa es regulable en altura.
     * @param height La altura de la mesa (0 si es regulable).
     * @param diameter El diámetro de la mesa.
     */
    public RoundTable(String material, boolean regulable, double height, double diameter) {
        this.material = material;
        this.regulable = regulable;
        this.height = height;
        this.diameter = diameter;
    }

    /**
     * Calcula el área de la mesa redonda.
     * @return El área de la mesa en metros cuadrados.
     */
    @Override
    public double AreaCalc() {
        return Math.PI * Math.pow(diameter / 2, 2); // Área de la mesa redonda: π * (radio)^2
    }

    /**
     * Calcula el número de comensales que caben en la mesa redonda.
     * Para mesas redondas, se calcula 1 comensal por cada 100 cm lineales de la mesa.
     * @return El número de comensales que caben en la mesa.
     */
    @Override
    public int guestCalc() {
        // En mesas redondas, calculamos 1 comensal por cada 100 cm lineales
        return (int) (Math.PI * diameter * 100 / 100); // El cálculo se basa en el perímetro de la mesa
    }

    // Métodos getters y setters si es necesario

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isRegulable() {
        return regulable;
    }

    public void setRegulable(boolean regulable) {
        this.regulable = regulable;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
