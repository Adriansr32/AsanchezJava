package Cadenes;
import java.util.Scanner;
public class Cadenes_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 6.-Escriu un programa que demani a l’usuari dues cadenes i busqui si la segona apareix dins de la primera. No pots utilitzar el mètode indexOf en aquest exercici.
		System.out.print("Introdueix una cadena: ");
		String c = in.nextLine().toLowerCase();
		System.out.print("Introdueix una altra cadena: ");
		String c1 = in.nextLine().toLowerCase();
		
		if (c.equals(c1)) {
			System.out.print("La cadena 1 esta dins de la cadena 2");
		} else {
			System.out.print("La cadena 1 NO esta dins de la cadena 2");
		}
		in.close();
	}

}
