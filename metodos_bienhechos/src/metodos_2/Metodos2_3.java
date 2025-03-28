package metodos_2;
import java.util.*;
public class Metodos2_3 {
	public static final String[] UNITATS = {"", "u", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
    public static final String[] DEZENES = {"", "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou"};
    public static final String[] DEZENES_COMPLETES = {"", "", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		int n = 0;
		while (!valid) {
			System.out.print("Introdueix un número positiu menor que 10000: ");
			if (in.hasNextInt()) {
				n = in.nextInt();
			 if (n > 0) {
				valid = true;
			} else {
				System.err.println("Introdueix un NÚMERO i POSITIU");
			}
			} else {
				System.err.println("Introdueix un NÚMERO i POSITIU");
				in.next();
		}
			}
		String nom = intToNom(n);
		System.out.println(nom);
		in.close();
		
	}
	public static String intToNom (int numero) {
		if (numero == 0) return "zero";
        if (numero < 0 || numero >= 10000) return "Número no vàlid";
        
        StringBuilder resultat = new StringBuilder();
		
		if (numero >= 1000) {
			int milers = numero / 1000;
			resultat.append(UNITATS[milers]).append(" mil");
			numero %= 1000;
		}
		if (numero >= 100) {
			int centenars = numero / 100;
			if ( centenars == 1) {
				resultat.append(" cent");
			} else {
				resultat.append(UNITATS[centenars]).append("-cents ");
			}
			numero %= 100;
		}
		
		if (numero >= 20) {
			int desenes = numero / 10;
			if (numero % 10 == 0) {
				resultat.append(DEZENES_COMPLETES[desenes]);
			} else {
				resultat.append(DEZENES_COMPLETES[desenes]).append("-");
				numero %= 10;
			}
		} else if ( numero >= 10) {
			resultat.append(DEZENES[numero - 10]);
			numero = 0;
		}
		
		if (numero > 0) {
			resultat.append(UNITATS[numero]);
		}
		
		return resultat.toString().trim().replaceAll(" $", "").replaceAll("u ", "un ");
	}

}
