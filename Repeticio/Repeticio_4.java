package Repeticio;
import java.util.Scanner;

public class Repeticio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int límit = sc.nextInt();
        sc.close();

        int comptador = 0;

        for (int i = 2; i < límit; i++) {
            boolean ésPrimer = true;
            for (int j = 2; j * j <= i && ésPrimer; j++) {
                ésPrimer = i % j != 0;
            }
            if (ésPrimer) {
                System.out.printf("%8d", i);
                comptador++;
                if (comptador % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
