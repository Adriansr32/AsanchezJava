package Repeticio;
import java.util.Scanner;

public class Repeticio_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int limit = in.nextInt();
        mostrarNombresPrimers(limit);
    }

    static void mostrarNombresPrimers(int limit) {
        int count = 0;
        for (int i = 1; i < limit; i++) {
            boolean esPrimer = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    esPrimer = false;
                    break;
                }
            }
            if (esPrimer) {
                System.out.printf("%5d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        if (count % 10 != 0) {
            System.out.println();
        }
    }
}
