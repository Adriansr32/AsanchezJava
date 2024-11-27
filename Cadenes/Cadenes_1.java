package Cadenes;
import java.util.Scanner;
public class Cadenes_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Entra un caracter: ");
		String cA = in.nextLine();
		
		System.out.print("Entra una cadena: ");
		String cD = in.nextLine();
		
		System.out.println("Aparicions del caràcter " + cA + ": "  + cD.indexOf(cA));
		
		char[] matriu = cD.toCharArray();
 
		int m = 0;
		for (int i = 0; i < matriu.length; i++) {
			 if (Character.isUpperCase(matriu[i])) {
				 m++;
			 }
			}
		System.out.print("Nombre de majúscules: " + m);
		
		in.close();

	}

}
	