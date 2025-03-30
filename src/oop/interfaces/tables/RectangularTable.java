package interfaces.tables;

import interfaces.TableCalculations;

/**
 * Clase que representa una mesa rectangular que implementa la interfaz TableCalculations.
 * Contiene los métodos para calcular el área de la mesa y el número de comensales.
 */
public class RectangularTable implements TableCalculations {
    // Atributos de la clase RectangularTable
    private String material; // Material de la mesa (vidrio, madera, metal)
    private boolean regulable; // Indica si la mesa es regulable en altura
    private double height; // Altura de la mesa (0 si es regulable)
    private double length; // Longitud de la mesa
    private double width; // Ancho de la mesa

    /**
     * Constructor para crear una mesa rectangular con los detalles especificados.
     * @param material El material de la mesa (vidrio, madera, metal).
     * @param regulable Indica si la mesa es regulable en altura.
     * @param height La altura de la mesa (0 si es regulable).
     * @param length La longitud de la mesa.
     * @param width El ancho de la mesa.
     */
    public RectangularTable(String material, boolean regulable, double height, double length, double width) {
        this.material = material;
        this.regulable = regulable;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    /**
     * Calcula el área de la mesa rectangular.
     * @return El área de la mesa en metros cuadrados.
     */
    @Override
    public double AreaCalc() {
        return length * width; // Área de la mesa rectangular
    }

    /**
     * Calcula el número de comensales que caben en la mesa rectangular.
     * Para mesas rectangulares, se calcula 1 comensal por cada 80 cm lineales de la mesa.
     * @return El número de comensales que caben en la mesa.
     */
    @Override
    public int guestCalc() {
        // En mesas rectangulares, calculamos 1 comensal por cada 80 cm lineales
        return (int) ((length + width) * 100 / 80); // El cálculo se basa en el perímetro de la mesa
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
