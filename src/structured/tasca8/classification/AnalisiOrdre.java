package Tasca8;

import java.util.Scanner;

public class Tasca8_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	
        System.out.println("---------- Longitut de la matriu ----------");
        System.out.print("Introdueix un numero: ");
        int n = in.nextInt();
        int[] matriu = new int[n];

        System.out.println();	
        System.out.println("---------- Elements de la matriu ----------");
        System.out.println("Introdueix el elements de la matriu: ");
        for (int i = 0; i < n; i++) {
        	System.out.print((i + 1) + " Elements: ");
            matriu[i] = in.nextInt();
        }

        boolean creixent = true;
        boolean decreixent = true;
        boolean totsIguals = true;

        for (int i = 1; i < n; i++) {
            if (matriu[i] <= matriu[i - 1]) {
                creixent = false;
            }
            if (matriu[i] >= matriu[i - 1]) {
                decreixent = false;
            }
            if (matriu[i] != matriu[i - 1]) {
                totsIguals = false;
            }
        }

        System.out.println();	
        System.out.println("---------- Resultat ----------");
        if (totsIguals) {
            System.out.println("Tots els elements són \"iguals\"");
        } else if (creixent) {
            System.out.println("Els elements estan ordenats de forma estrictament \"creixent\"");
        } else if (decreixent) {
            System.out.println("Els elements estan ordenats de forma estrictament \"decreixent\"");
        } else {
            System.out.println("Els elements estan \"desordenats\"");
        }
        
        in.close();
    }
}
