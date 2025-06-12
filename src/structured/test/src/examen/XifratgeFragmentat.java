package examen;

import java.util.Scanner;

public class XifratgeFragmentat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rawSentence, cipheredSentence;
		System.out.print("Introdueix la frase a xifrar (només pot contenir majúscules o espais):");
		rawSentence = sc.nextLine();
		
		int ascii;
		cipheredSentence = "";
		for(int i=0; i<rawSentence.length(); i++) {
			ascii = rawSentence.charAt(i);
			if (ascii == ' ') {
				cipheredSentence += "AA";
			} else if (ascii >= 'A' & ascii <= 'Z') {
				cipheredSentence += (char)('A'+ascii/10);
				cipheredSentence += (char)('A'+ascii%10);				
			} else {
				System.out.println("La frase conte caràcters no permesos. Siusplau introdueix una frase que només contingui espais o lletres majúscules.");
				System.out.println(ascii);
				System.out.println((char)ascii);
				System.exit(1);
			}
		}
		
		System.out.println("La teva frase encriptada és: " + cipheredSentence);
	}
}
