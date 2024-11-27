package Bucles;
import java.util.Scanner;

public class Bucles_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        do {
            System.out.print("Introdueix un valor enter: ");
            if (in.hasNextInt()) {
                valor = in.nextInt();
                if (valor >= 0) {
                    System.out.printf("%d\u00B2 = %d%n", valor, valor * valor);
                } else {
                    System.out.println("Has introduït un número negatiu. El programa ha acabat.");
                }
            } else {
                in.next(); 
                System.out.print("Aquest valor no és correcte. ");
                valor = 0;
            }
        } while (valor >= 0);

        in.close();
    }
}
