package Tasca8;
import java.util.Scanner;
public class Tasca8_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("---------- Longitut matriu ----------");
		System.out.print("Introdueix un numero: ");
		int n = in.nextInt();
		
		System.out.println("La longitud de la matriu es: " + n);
		int[] m = new int[n];
		int[] m2 = new int[n];
		
		
		System.out.println();
		System.out.println("---------- Elements de la matriu ----------");
		System.out.println("Introdueix elements per omplir la matriu: ");
        for (int i = 0; i < n - 1; i++) {
        	System.out.print((i + 1) + " Elements: ");
            m[i] = in.nextInt();
        }
        System.out.println();
        System.out.println("---------- Resultat del elements ----------");
        for (int i = 0; i < m.length - 2; i++) {
        System.out.print(m[i] + ", ");
    	
	}
        System.out.print(m[m.length - 2]);
        
        System.out.println();
        System.out.println("---------- Modificacio de la matriu ----------");
        System.out.print("Donem un numero: ");
        int num = in.nextInt();
        System.out.print("Donem una posicio (0 - " + (n - 1) + "): ");
        int pos = in.nextInt();
        
        for (int i = 0; i < n; i++) {
        	if (i < pos) {
        		m2[i] = m[i]; 
        	}
        	else if (i == pos) {
        		m2[i] = num;
        	}
        	else {
        		m2[i] = m[i - 1];
        	}
        }
        System.out.println();	
        System.out.println("---------- Matriu final ----------");
        System.out.print("[");
        for (int i = 0; i < m2.length - 1; i++) {
        	System.out.print(m2[i] + ", ");
        }
        System.out.println(m2[m2.length - 1] + "]");
        
        in.close();
	}
}
