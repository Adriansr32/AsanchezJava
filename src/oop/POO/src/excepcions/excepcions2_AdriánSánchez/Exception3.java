package excepcions2_AdriánSánchez;

import javax.swing.JOptionPane;

/**
 * La clase Exception3 es un programa que solicita al usuario que introduzca un número entero
 * entre 10 y 50. Maneja excepciones personalizadas y muestra mensajes de error a través de
 * ventanas de diálogo.
 */
public class Exception3 {

    /**
     * El método principal que ejecuta el programa.
     * Solicita al usuario un número y verifica si está dentro del rango permitido.
     * Muestra un mensaje de éxito si todo va bien, o un mensaje de error en caso de excepciones.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        try {
            cridaNumero();
            JOptionPane.showMessageDialog(null, "Tot ha anat ok", "Èxit", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (OutOfRangeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que solicita al usuario un número entero y verifica si está dentro del rango
     * permitido (10 a 50). Lanza excepciones si el número está fuera de rango o si el
     * formato de entrada no es válido.
     * 
     * @throws IllegalArgumentException Si el usuario no introduce un número entero válido.
     * @throws OutOfRangeException Si el número introducido no está entre 10 y 50.
     */
    public static void cridaNumero() throws IllegalArgumentException, OutOfRangeException {
        String input = JOptionPane.showInputDialog("Introdueix un número enter entre 10 i 50:");

        try {
            int number = Integer.parseInt(input);

            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Error: El número ha d'estar entre 10 i 50.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Has d'introduir un número enter vàlid.");
        }
    }
}
