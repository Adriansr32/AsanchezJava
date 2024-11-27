package Tasca8b;
import java.util.Scanner;
public class Tasca8b_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean longitut = false;
		int l = 0;
        System.out.println("---------- Longitut ----------");
		while (!longitut) {
			System.out.print("Digues quants numeros vols entrar [0 - 100]: ");
			l = in.nextInt();
			if (l > 0 && l < 101) {
				longitut = true;
			} 
		}
		
		int[] m = new int[101];
	
		for (int i = 0; i < l; i++) {
			System.out.print("Entra el " + (i + 1) + " numero: ");
			int n = in.nextInt();
			m[n] = m[n] + 1;
		}
		System.out.println("---- RESULTAT ----");
		for (int i = 0; i < l; i++) {
			if (m[i] != 0) {
			System.out.println(i + " Apareix " + m[i] + " vegades");
			}
		}
		in.close();
	}

}
