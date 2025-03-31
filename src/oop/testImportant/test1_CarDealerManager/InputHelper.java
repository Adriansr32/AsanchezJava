package examen3_1;

import java.util.*;

/*
 * Clase InputHelper que el que fa es controlar les entrades de l'usuari per prevenir errors
 */
public class InputHelper {
	/*
	 * Metode static global del scanner
	 */
	private static Scanner scanner = new Scanner(System.in);

	/*
	 * Metode readInt que el que fa es recibir un int ( numero ) y el comprova que
	 * tot estigui correcta
	 * 
	 * @pram message
	 * 
	 * @eturn value
	 */
	public static int readInt(String message) {
		int value;
		while (true) {
			System.out.print(message);
			if (scanner.hasNextInt()) {
				value = scanner.nextInt();
				scanner.nextLine();
				return value;
			} else {
				System.out.println("Error: Has d'ingresar un número.");
				scanner.next();
			}
		}
	}

	/*
	 * Metode readDouble que el que fa es recibir un Double ( numero.decimal ) i el
	 * comprova que tot estigui correctament
	 * 
	 * @pram message
	 * 
	 * @return value
	 */
	public static double readDouble(String message) {
		double value;
		while (true) {
			System.out.print(message);
			if (scanner.hasNextDouble()) {
				value = scanner.nextDouble();
				scanner.nextLine();
				return value;
			} else {
				System.out.println("Error: Hasd'insgresar un decimal.");
				scanner.next();
			}
		}
	}

	/*
	 * Metode readFloat que el que fa es recibir un float ( numero.decimal ) i el
	 * comprova que tot estigui correctament
	 * 
	 * @pram message
	 * 
	 * @return value
	 */
	public static float readFloat(String message) {
		float value;
		while (true) {
			System.out.print(message);
			if (scanner.hasNextFloat()) {
				value = scanner.nextFloat();
				scanner.nextLine();
				return value;
			} else {
				System.out.println("Error: Hasd'insgresar un decimal.");
				scanner.next();
			}
		}
	}

	/*
	 * Metodo readString que el que fa es recibir una cadena ( "holaaa" ) i comprova
	 * que tot estigui correctament
	 * 
	 * @pram message
	 * 
	 * @return scanner.nextLine();
	 */
	public static String readString(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}
}
