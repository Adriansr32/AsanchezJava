package excepcions2_AdriánSánchez;

import java.util.*;

/**
 * La clase Exception2 es un programa que solicita al usuario que introduzca un número
 * y calcula el resultado de dividir 3 entre ese número. Maneja excepciones para
 * asegurar que el usuario introduce un número válido y que no se produzca una división
 * entre cero.
 */
public class Exception2 {

    /**
     * El método principal que ejecuta el programa.
     * Solicita al usuario que introduzca un número y calcula el resultado de dividir
     * 3 entre ese número. Maneja excepciones para capturar errores de formato de número
     * y divisiones por cero.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("Introdueix un Numero: ");
        String input = sc.nextLine();
        try {
            int numero = Integer.parseInt(input);
            int resultat = 3 / numero;
            System.out.println("El resultat de 3 dividit entre " + numero + " és: " + resultat);
        } catch (NumberFormatException e) {
            System.out.println("Error: No has introduït un número vàlid.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No es pot dividir entre zero.");
        } finally {
            System.out.println("Realizat");
        }
    }
}
