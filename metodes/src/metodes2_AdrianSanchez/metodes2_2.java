package metodes2_AdrianSanchez;
import java.util.Scanner;

public class metodes2_2 {
	 public static double llegirFinsDouble(Scanner in, String prompt) {
	        double resultat = 0;
	        boolean esValid = false;

	        while (!esValid) {
	            System.out.print(prompt); 
	            if (in.hasNextDouble()) {
	                resultat = in.nextDouble();
	                
	                if (resultat % 1 != 0) {
	                    esValid = true; 
	                } else {
	                    System.out.println("Error: Has d'introduir un número decimal (no enter).");
	                }
	            } else {
	                System.out.println("Error: Has d'introduir un número de tipus double.");
	                in.next(); 
	            }
	        }

	        return resultat;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double d = llegirFinsDouble(in, "Introdueix un número decimal: ");
	        System.out.println("Número introduït: " + d);
	    }
	}
