package metodos_2;

import java.util.Scanner;

public class Metodo2_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = askInput(in, "Introdueix un número entre el 1 i 3999: ");
		System.out.println("Número Romá: " + toRoman(n));
		System.out.println("Número Catalá: " + toCatalan(n));

	}
	
	public static String toRoman(int numero) {
	    String[] miles = {"", "M", "MM", "MMM"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        String romano = miles[numero / 1000];
        numero %= 1000;
        romano += centenas[numero / 100];
        numero %= 100;
        romano += decenas[numero / 10];
        numero %= 10;
        romano += unidades[numero];
        
        return romano;
	}
	public static String toCatalan(int numero) {
		String[] UNITATS = { "", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou" };
		String[] DEZENES = { "", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta" };
		String[] DEZENESCompostes = { "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou" };
		
		String palabra = "";
		
		if (numero >= 1000) {
			palabra += UNITATS[numero / 1000];
			numero %= 1000;
			if (numero > 0) {
				palabra += "-mil ";
			}
		}
		if (numero >= 100) {
			palabra += UNITATS[numero / 100];
			numero %= 100;
			if (numero > 0) {
				palabra += "-cents ";
			}
		}
        if (numero >= 20) {
            palabra += DEZENES[numero / 10];
            numero %= 10;
            if (numero > 0) {
                palabra += "-" + UNITATS[numero];
            }
        } else if (numero >= 10) {
            palabra += DEZENESCompostes[numero - 10];
        } else if (numero > 0) {
            palabra += UNITATS[numero];
        }
        
        
		return palabra;
	}
	public static int askInput(Scanner in, String prompt) {
		
		boolean valid = false;
		int n = 0;
		while (!valid) {
			System.out.print(prompt);
			if (in.hasNextInt()) {
				n = in.nextInt();
			 if (n < 0 || n >= 3999) {
				 System.err.println("El número ha d'estar entre el 1 i el 3999");
			} else  {
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
