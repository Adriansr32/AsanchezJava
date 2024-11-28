package Repeticio;
import java.util.Scanner;

public class Repeticio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int contadorPositius = 0;
        int contadorNegatius = 0;
        int sumaTotal = 0;
        int contadorTotal = 0;

        do {
            System.out.print("Entra un enter (0 per sortir): ");
            numero = in.nextInt();

            if (numero != 0) {
                if (numero >= 0) {
                    contadorPositius++;
                } else if (numero < 0) {
                    contadorNegatius++;
                }

                sumaTotal += numero;
                contadorTotal++;
            }
        } while (numero != 0); 
        System.out.println();
        if (contadorTotal > 0) {
            System.out.println("Nombres positius: " + contadorPositius);
            System.out.println("Nombres negatius: " + contadorNegatius);
            System.out.println("Suma total: " + sumaTotal);
            double mitjana = (double) sumaTotal / contadorTotal;
            System.out.printf("Mitjana aritmètica: %.2f%n", mitjana);
        } else {
            System.out.println("No s'ha introduït cap nombre.");
        }

        in.close();
    }
}
