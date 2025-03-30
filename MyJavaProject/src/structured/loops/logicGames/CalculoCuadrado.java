package Bucles;
import java.util.Scanner;

public class Bucles_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int contador = 0; 

        do {
            System.out.print("Escriu un número enter: ");
            n = in.nextInt();

            if (n >= 0) {
                contador++;             }
        } while (n >= 0); 

        System.out.println("Nombre d'entrades: " + contador);
        in.close();
    }
}
