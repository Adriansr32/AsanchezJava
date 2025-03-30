package Tasca8;

import java.util.Scanner;

public class Tasca8_6 {
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
        
        System.out.println();	
        System.out.println("---------- Modificacio de la matriu ----------");
        System.out.print("Quantes posicions vols moures: ");
        int pos = in.nextInt() % n;
        
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[(i + pos) % n] = matriu[i];
        }

        System.out.println();	
        System.out.println("---------- Matriu final ----------");
        System.out.print("[");
        for (int i = 0; i < r.length - 1; i++) {
            System.out.print(r[i] + ", ");
        }
        
        System.out.println(r[r.length - 1] + "]");
        
        in.close();    
      }
}

