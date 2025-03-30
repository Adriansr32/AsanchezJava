package interfaces;

/**
 * Interfaz para realizar cálculos de una mesa, como el área y los comensales.
 */
public interface TableCalculations {

    /**
     * Calcula el área de la mesa.
     * @return El área de la mesa en metros cuadrados.
     */
    double AreaCalc();

    /**
     * Calcula el número de comensales que caben en la mesa.
     * @return El número de comensales.
     */
    int guestCalc();
}
