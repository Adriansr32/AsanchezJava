package Tasca8b;

import java.util.Random;

public class Tasca8b_2 {
    public static void main(String[] args) {
        int[][] matriu = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriu[i][j] = random.nextInt(10);
            }
        }

        int[] sFs = new int[10];
        int[] sC = new int[10];
        for (int i = 0; i < 10; i++) {
            int sF = 0;
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d", matriu[i][j]);
                sF += matriu[i][j];
                sC[j] += matriu[i][j];
            }
            sFs[i] = sF;
            System.out.println(" | " + sF);
        }

        System.out.println("------------------------------+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", sC[i]);
        }
    }
}

