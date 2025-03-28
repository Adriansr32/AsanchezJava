package examen;
import java.util.Scanner;
public class Xifratge_fragment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Frase: ");
		String f = in.nextLine().toUpperCase();
		
		
		System.out.print("La teva frase encriptada es: ");
		for (int i = 0; i < f.length(); i++) {
			char a = f.charAt(i);
			int c = (int)a;
			int p = c / 10;
			
			
			if (p == 0) {
				System.out.print("A");
			} 
			 if (p == 1) {
				System.out.print("B");
			}  
			 if (p == 2) {
				System.out.print("C");
			} 
			 if (p == 3) {
				System.out.print("D");
			}
			
			 if (p == 4) {
				System.out.print("E");
			}
			 if (p == 5) {
				System.out.print("F");
			} 
			 if (p == 6) {
				System.out.print("G");
			}
			 if (p == 7) {
				System.out.print("H");
			} 
			 if (p == 8) {
				System.out.print("I");
			} 
			 if (p == 9) {
				System.out.print("J");
			} 
			int q = c % 10;
			if (q == 0) {
				System.out.print("A");
			}
			if (q == 1) {
				System.out.print("B");
			}
			if (q == 2) {
				System.out.print("C");
			}
			if (q == 3) {
				System.out.print("D");
			}
			if (q == 4) {
				System.out.print("E");
			}
			if (q == 5) {
				System.out.print("F");
			}
			if (q == 6) {
				System.out.print("G");
			}
			if (q == 7) {
				System.out.print("H");
			}
			if (q == 8) {
				System.out.print("I");
			}
			if (q == 9) {
				System.out.print("J");
			}
		}
	
		in.close();
		
	}

}
