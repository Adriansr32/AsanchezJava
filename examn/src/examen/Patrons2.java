package demo;

import java.util.Scanner;


public class Patrons2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "Segons aquesta seqüència d’ADN la persona té: ";
		// String adn = "TGGCACAAAACCTTTTGGGACCTACCTGGATCAAAAAACCCACTGTGGA";
		System.out.print("Introdueix la seqüencia de ADN:");
		String adn = sc.nextLine();
		
		// Validació 
		char c;
		for (int i = 0; i < adn.length(); i++) {
			c = adn.charAt(i);
			if (!(c == 'A' || c == 'C' ||c == 'T' ||c == 'G')){
				System.out.println("Cadena de ADN no vàlida!");
				System.exit(1);
			}
		}

		// Detecció de patrons i construcció de cadena
		int patronDetectats = 0;		
		if (adn.contains("ACCTGGATCAAA")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "sang tipus O";
		}
		if (adn.contains("ACCTGGATCAAT")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "sang tipus A";
		}
		if (adn.contains("ACCTGGATCATT")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "sang tipus B";
		}
		if (adn.contains("ACCTGGATCACT")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "sang tipus AB";
		}
		if (adn.contains("ACTGTGGA")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "ulls blaus";
		}
		if (adn.contains("ACTGTGGC")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "ulls marrons";
		}
		if (adn.contains("ACTGTGGT")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "ulls verds";
		}
		if (adn.contains("TGGCACCT")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "cabell ròs";
		}
		if (adn.contains("TGGCACCG")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "cabell castany";
		}
		if (adn.contains("TGGCACAA")){
			if (patronDetectats++ != 0) {
				output += ", ";
			}
			output += "cabell negres";
		}
		
		// Mostrar resultat
		if (patronDetectats > 0) {
			System.out.println(output);
		} else {
			System.out.println("Cap patro detectat!");
		}
	}

}
