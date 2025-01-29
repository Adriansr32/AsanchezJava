package demo;

import java.util.Scanner;


public class Patrons1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "Segons aquesta seqüència d’ADN la persona té: ";
		// String adn = "TGGCACAAAACCTTTTGGGACCTAAACCCACTGTGGA";
		System.out.print("Introdueix la seqüencia de ADN:");
		String adn = sc.nextLine();
		String[] patrons = {	
			"ACCTGGATCAAA",
			"ACCTGGATCAAT",
			"ACCTGGATCATT",
			"ACCTGGATCACT",
			"ACTGTGGA",
			"ACTGTGGC",
			"ACTGTGGT",
			"TGGCACCT",
			"TGGCACCG",
			"TGGCACAA"
		};
		String[] gens = {
				"sang tipus O", "sang tipus A", "sang tipus B", "sang tipus AB",
				"ulls blaus", "ulls marrons", "ulls verds",
				"cabell ròs", "cabell castany", "cabell negres"
		};
		
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
		for (int i = 0; i < patrons.length; i++) {			
			if (adn.contains(patrons[i])){
				if (patronDetectats++ != 0) {
					output += ", ";
				}
				output += gens[i];
			}
		}
		
		// Mostrar resultat
		if (patronDetectats > 0) {
			System.out.println(output);
		} else {
			System.out.println("Cap patro detectat!");
		}
	}

}
