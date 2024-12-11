package Cadenes;
<<<<<<< HEAD
public class Cadenes_5 {

	public static void main(String[] args) {
		// 5.- Escriu un programa que donada una cadena retorni la suma de tots els dígits 0-9 que hi apareguin.
		// Introdueix cadena: edf7ert6ergt9m2kso
		// La suma dels números apareguts és: 24

=======
import java.util.Scanner;
public class Cadenes_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 5.- Escriu un programa que donada una cadena retorni la suma de tots els dígits 0-9 que hi apareguin.
		// Introdueix cadena: edf7ert6ergt9m2kso
		// La suma dels números apareguts és: 24
		System.out.println("Introdueix cadena: ");
		String c = in.nextLine();
		
		char[] matriu = c.toCharArray();
		
		int p = 0;
		for (int i = 0; i < matriu.length; i++) {
			 if (Character.isDigit(matriu[i])) {
				 p += matriu[i];
			 }
		}
		System.out.println(p);
		in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
	}

}
