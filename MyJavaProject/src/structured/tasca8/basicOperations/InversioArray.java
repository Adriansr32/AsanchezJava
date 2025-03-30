package Tasca8;

import java.util.Scanner;

public class Tasca8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nombres = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introdueix el nombre (" + (i + 1) + " de 5)" + ": ");
            nombres[i] = in.nextInt();
        }

        System.out.println("Els nombres en ordre invers són:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(nombres[i]);
        }

        in.close();
    }
}

