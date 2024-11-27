package Cadenes;
import java.util.Scanner;
public class Cadenes_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 3.- Escriu un programa que determini si una cadena és un password vàlid.
		// El password ha de tenir un mínim de 8 caràcters.
		// El password ha de tenir almenys una lletra minúscula i almenys una lletra majúscula.
		// Com a mínim ha de tenir dos dígits
		
		boolean GP = false;
		while (!GP) {
			
			System.out.print("Escriu un password: ");
			String p = in.nextLine();
			int l = p.length();
			
			char[] matriu = p.toCharArray();
			 
			int m = 0;
			for (int i = 0; i < matriu.length; i++) {
				 if (Character.isUpperCase(matriu[i])) {
					 m++;
				 }
				}
			int m2 = 0;
			for (int i = 0; i < matriu.length; i++) {
				 if (Character.isLowerCase(matriu[i])) {
					 m2++;
				 }
			}
			int m3 = 0;
			for (int i = 0; i < matriu.length; i++) {
				 if (Character.isDigit(matriu[i])) {
					 m3++;
				 }
			}
				
			if (l <= 7) {
				System.out.println("El password ha de tenir un mínim de 8 caràcters.");
			} else if (m < 1) {
				System.out.println("El password ha de tenir almenys una lletra minúscula i almenys una lletra majúscula.");
			} else if (m2 < 1) {
				System.out.println("El password ha de tenir almenys una lletra minúscula i almenys una lletra majúscula.");
			} 
			else if (m3 < 2) {
				System.out.println("Com a mínim ha de tenir dos dígits");
			} else {
				System.out.println("Bona password, Good job!");
				GP = true;
			}
			
		}
		in.close();
		
	}

}
