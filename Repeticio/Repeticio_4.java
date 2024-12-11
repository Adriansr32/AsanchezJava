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

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int límit = sc.nextInt();
        sc.close();

        int comptador = 0;

        for (int i1 = 2; i1 < límit; i1++) {
            boolean ésPrimer = true;
            for (int j = 2; j * j <= i1 && ésPrimer; j++) {
                ésPrimer = i1 % j != 0;
            }
            if (ésPrimer) {
                System.out.printf("%8d", i1);
                comptador++;
                if (comptador % 10 == 0) {

                    System.out.println();
                }
            }
        }

        if (count % 10 != 0) {
            System.out.println();
        }


    }
            }
        }}}
