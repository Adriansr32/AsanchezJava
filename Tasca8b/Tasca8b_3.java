package Tasca8b;
import java.util.Random;
import java.util.Scanner;

public class Tasca8b_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] m = new int[5][5];
        int intents = 0;
        int VC = 0;

        int FV1 = random.nextInt(5);
        int CV1 = random.nextInt(5);
        int FV2 = random.nextInt(5);
        int CV2 = random.nextInt(5);

        m[FV1][CV1] = 1;
        m[FV2][CV2] = 1;
        
       /* Per comprovar la posicions del vaixell 
        * System.out.println("Fila1: " + filaVaixell1 + " Colummna1: "  + columnaVaixell1 + " f2: " + filaVaixell2 + " c2: " +columnaVaixell2);*/
        while (VC < 2) {
        	System.out.println("---------- Tauler ----------");
            System.out.println("  A B C D E");
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 5; j++) {
                    if (m[i][j] == 1) {
                        System.out.print("* ");
                    } else if (m[i][j] == -1) {
                        System.out.print("V ");
                    } else if (m[i][j] == -2) {
                        System.out.print("A ");
                    } else {
                    	System.out.print("* ");
                    }
                }
                System.out.println();
            }
            System.out.println("");
            System.out.print("Introdueix una coordenada (ex: B1, A4): ");
            String c = in.nextLine().toUpperCase();
            System.out.println("");
            intents++;
            
            if (c == "p") {
            	System.out.print("El primer barco esta en la fila: " + FV1 + " y en la columna: " + CV1 + " El primer barco esta en la fila: " + FV1 + " y en la columna: " + CV1);
            }
            
            char cl = c.charAt(0);
            char f = c.charAt(1);
            int CI = cl - 'A';
            int FI = f - '1';

            if (FI >= 0 && FI < 5 && CI >= 0 && CI < 5) {
                if (m[FI][CI] == 1) {
                    System.out.println(c + " = tocat i enfosat!!");
                    m[FI][CI] = -1;
                    
                    VC++;
                    
                } else if (m[FI][CI] == 0) {
                    System.out.println(c + " = AIGUA");
                    m[FI][CI] = -2;
                } else {
                    System.out.println("Coordenada ja descoberta. Prova'n altre.");
                }
            } else {
                System.out.println("Coordenada no vàlida. Prova'n altre.");
            }
        }
        System.out.println();
        System.out.println("---------- Tauler resultat ----------");
        System.out.println("  A B C D E");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == 1) {
                    System.out.print("* ");
                } else if (m[i][j] == -1) {
                    System.out.print("V ");
                } else if (m[i][j] == -2) {
                    System.out.print("A ");
                } else {
                	System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------- Posicions ----------");
        System.out.println("La posició dels vaixells era: " + (char)('A' + CV1) + (FV1 + 1) + " i " + (char)('A' + CV2) + (FV2 + 1));
        System.out.println("---------- Intents ----------");
        System.out.println("Has enfonsat tots els vaixells en " + intents + " jugades!");
        in.close();
    }
}
