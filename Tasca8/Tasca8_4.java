package Tasca8;
import java.util.Scanner;
public class Tasca8_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("---------- Longitut matriu ----------");
		System.out.print("Introdueix un numero: ");
		int n = in.nextInt();
		
		int[] m = new int[n];

		
		int parell = 0;
		int senars = 0;
		System.out.println();
		System.out.println("---------- Elements de la matriu ----------");
		System.out.println("Introdueix elements per omplir la matriu: ");
        for (int i = 0; i < n ; i++) {
        	System.out.print((i + 1) + " Elements: ");
            m[i] = in.nextInt();
            if (m[i] % 2 == 0) {
            	parell++;
            } else {
            	senars++;
            }
            
        }
		int[] mP = new int[parell];
		int[] mS = new int[senars];
        
		int indexP = 0; 
        int indexS = 0; 
        for (int i = 0; i < m.length; i++) {
        	if (m[i] % 2 == 0) {
        		mP[indexP++] = m[i]; 
        	} else {
        		mS[indexS++] = m[i];
        	}
        }
        System.out.println();
        System.out.println("---------- Matriu Parells ----------");
        System.out.print("[");
        for (int i = 0; i < mP.length - 1; i++) {
            System.out.print(mP[i] + ", ");
        	
    	}
            System.out.println(mP[mP.length - 1] + "]");
            System.out.println();
            System.out.println("---------- Matriu Senars ----------");
            System.out.print("[");
            for (int i = 0; i < mS.length - 1; i++) {
                System.out.print(mS[i] + ", ");
            	
        	}
                System.out.println(mS[mS.length - 1] + "]");
             in.close();
             
	}

}
