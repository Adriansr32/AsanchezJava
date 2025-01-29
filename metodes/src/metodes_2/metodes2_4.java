package metodes_2;

import java.util.*;

public class metodes2_4 {

	   public static String convertirARomans(int numero) {
	        if (numero < 1 || numero > 3999) {
	            throw new IllegalArgumentException("El número ha d'estar entre 1 i 3999.");
	        }

	        int[] valors = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	        StringBuilder resultat = new StringBuilder();

	        for (int i = 0; i < valors.length; i++) {
	            while (numero >= valors[i]) {
	                resultat.append(romans[i]);
	                numero -= valors[i];
	            }
	        }

	        return resultat.toString();
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Introdueix un número entre 1 i 3999: ");
	        while (!in.hasNextInt()) {
	            System.out.println("Error: Has d'introduir un número enter.");
	            in.next(); 
	            System.out.print("Introdueix un número entre 1 i 3999: ");
	        }

	        int numero = in.nextInt();

	        if (numero < 1 || numero > 3999) {
	            System.out.println("Error: El número ha d'estar entre 1 i 3999.");
	        } else {
	            String romans = convertirARomans(numero);
	            System.out.println("El número " + numero + " en romans és: " + romans);
	        }
	        in.close();
	    }
	}
