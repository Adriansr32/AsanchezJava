package excepcions2_AdriánSánchez;

import java.util.*;

/**
 * La clase Exception1 es un programa que solicita al usuario un String
 * y lo invierte si cumple con la longitud mínima requerida.
 * Si el String introducido tiene menos de 10 caracteres, se lanza una
 * excepción IllegalArgumentException con un mensaje específico.
 */
public class Exception1 {

    /**
     * El método principal que ejecuta el programa.
     * Solicita al usuario que introduzca un String y lo invierte si
     * cumple con la longitud mínima de 10 caracteres. En caso contrario,
     * se lanza una IllegalArgumentException y se muestra un mensaje de error.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Introdueix un String: ");
            String input = sc.nextLine();
            try {
                if (input.length() < 10) {
                    throw new IllegalArgumentException("L'String ha de tenir almenys 10 caràcters.");
                }

                String cadenaInvertida = new StringBuilder(input).reverse().toString();
                System.out.println("Cadena invertida: " + cadenaInvertida);
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Realizat");
            }
        }
    }
}
