package metodos_2;

import java.util.Scanner;

public class Metodos2_3Remix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = askInput(in, "Introdueix un número positiu menor que 10000: ");
		String nom = intToNom(n);
		System.out.println(nom);
		in.close();
	}
	
	public static String intToNom(int numero) {
		String[] UNITATS = { "", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou" };
		String[] DEZENES = { "", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta" };
		String[] DEZENESCompostes = { "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou" };
      

        String palabras = "";
        if (numero >= 1000) {
        	palabras += UNITATS[numero / 1000];
        	numero %= 1000;
        	if (numero > 0) {
        		palabras += "-mil ";
        	}
        }
        
        if (numero >= 100) {
            palabras += UNITATS[numero / 100];
            numero %= 100;
            if (numero > 0) {
                palabras += "-cents ";
            }
        }

        if (numero >= 20) {
            palabras += DEZENES[numero / 10];
            numero %= 10;
            if (numero > 0) {
                palabras += "-" + UNITATS[numero];
            }
        } else if (numero >= 10) {
            palabras += DEZENESCompostes[numero - 10];
        } else if (numero > 0) {
            palabras += UNITATS[numero];
        }

        return palabras;
	}
	public static int askInput(Scanner in, String prompt) {
		
		boolean valid = false;
		int n = 0;
		while (!valid) {
			System.out.print(prompt);
			if (in.hasNextInt()) {
				n = in.nextInt();
			 if (n < 0 || n >= 10000) {
				 System.err.println("Introdueix un NÚMERO i POSITIU");
			} else {
				valid = true;
			}
			} else {
				System.err.println("Introdueix un NÚMERO i POSITIU");
				in.next();
		}
			}
		return n;
	}
}
