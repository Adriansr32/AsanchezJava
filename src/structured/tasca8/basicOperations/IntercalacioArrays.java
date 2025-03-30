package Tasca8;

import java.util.Scanner;

public class Tasca8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix un numero: ");
        int n = in.nextInt();

        int[] matriu1 = new int[n * 3];
        int[] matriu2 = new int[n * 3];
        int[] matriuFinal = new int[n * 6]; 
        
        System.out.println("La longitut de les dues matriu sera: "+ (n * 3));

        System.out.println("Introdueix els " + (n * 3) + " elements de la primera matriu: ");
        for (int i = 0; i < n * 3; i++) {
        	System.out.print((i + 1) + " Element: ");
            matriu1[i] = in.nextInt();
        }

        System.out.println("Introdueix els " + (n * 3) + " elements de la segona matriu:");
        for (int i = 0; i < n * 3; i++) {
        	System.out.print((i + 1) + " Element: ");
            matriu2[i] = in.nextInt();
        }

        int indexFinal = 0;
        for (int i = 0; i < n * 3; i = i + 3) {
            
            for (int j = 0; j < 3; j++) {
                matriuFinal[indexFinal++] = matriu1[i + j];
            }
            
            for (int j = 0; j < 3; j++) {
                matriuFinal[indexFinal++] = matriu2[i + j];
            }
        }

        System.out.print("Elements de la matriu final: ");
        System.out.print("[");
        for (int i = 0; i < matriuFinal.length - 1; i++) {
                System.out.print(matriuFinal[i] + ", ");    		
        } 
           System.out.print(matriuFinal[matriuFinal.length - 1] + "]");
        in.close();
    }
}

