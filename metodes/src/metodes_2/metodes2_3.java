package metodes_2;
import java.util.Scanner;

public class metodes2_3 {


	    
	    private static final String[] UNITATS = {"", "u", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
	    private static final String[] DEZENES = {"", "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou"};
	    private static final String[] DEZENES_COMPLETES = {"", "", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};
	    
	    public static String intToNom(int numero) {
	        if (numero == 0) return "zero";
	        if (numero < 0 || numero >= 10000) return "Número no vàlid";
	        
	        StringBuilder resultat = new StringBuilder();

	        if (numero >= 1000) {
	            int milers = numero / 1000;
	            resultat.append(UNITATS[milers]).append(" mil ");
	            numero %= 1000;
	        }

	        if (numero >= 100) {
	            int centenes = numero / 100;
	            if (centenes == 1) {
	                resultat.append("cent ");
	            } else {
	                resultat.append(UNITATS[centenes]).append(" cent ");
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
	        } else if (numero >= 10) {
	            resultat.append(DEZENES[numero - 10]);
	            numero = 0;
	        }

	        if (numero > 0) {
	            resultat.append(UNITATS[numero]);
	        }

	        return resultat.toString().trim().replaceAll(" $", "").replaceAll("u ", "un ");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.print("Entra un número positiu < 10000: ");
	            int numero = scanner.nextInt();
	            
	            if (numero < 0) {
	                break;
	            }
	            
	            String nom = intToNom(numero);
	            System.out.println(nom);
	        }
	        
	        scanner.close();
	    }
	}
