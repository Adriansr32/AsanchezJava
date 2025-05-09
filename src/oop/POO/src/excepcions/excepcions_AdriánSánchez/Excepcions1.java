package excepcions_AdriánSánchez;

import java.util.*;

/**
 * Aquesta classe llegeix una entrada de l'usuari i comprova si és "Yes" o "No".
 * Si la resposta no és vàlida, es llança una excepció amb un missatge explicatiu.
 * Retorna un valor booleà segons la resposta introduïda.
 * 
 * "Yes" → true  
 * "No" → false
 * 
 * El programa continua demanant una entrada fins que es rebi una resposta vàlida.
 * 
 * @author Adrián
 */
public class Excepcions1 {

	/**
	 * Mètode principal que demana a l'usuari que introdueixi "Yes" o "No" i mostra el resultat.
	 * 
	 * @param args Arguments de la línia de comandes (no s'utilitzen).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		boolean validInput = false;

		while (!validInput) {
			System.out.println("Introdueix Yes o No: ");
			String value = sc.nextLine();

			try {
				result = getBooleanValue(value);
				validInput = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("El valor introduït és: " + result);
	}

	/**
	 * Converteix una cadena de text en un valor booleà si la cadena és "Yes" o "No".
	 * 
	 * @param value Valor introduït per l'usuari.
	 * @return true si el valor és "Yes", false si és "No".
	 * @throws Exception si el valor no és ni "Yes" ni "No" amb la primera lletra en majúscula.
	 */
	public static boolean getBooleanValue(String value) throws Exception {
		if (!value.equals("Yes") && !value.equals("No")) {
			throw new Exception("Ha de ser Yes o No (amb la primera lletra en majúscula).");
		}
		return value.equals("Yes");
	}
}
