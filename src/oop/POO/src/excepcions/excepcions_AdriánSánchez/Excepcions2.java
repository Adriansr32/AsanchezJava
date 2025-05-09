package excepcions_AdriánSánchez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Aquesta classe llegeix un fitxer de text que conté números separats per espais,
 * calcula la mitjana de cada línia i gestiona possibles excepcions com valors no numèrics
 * o la inexistència del fitxer.
 * 
 * @author Adrián
 */
public class Excepcions2 {

	/**
	 * Mètode principal que inicia l'execució del programa.
	 * 
	 * @param args Arguments de la línia de comandes (no s'utilitzen).
	 */
	public static void main(String[] args) {
		File file = new File("numeros.txt");
		readFile(file);
	}

	/**
	 * Llegeix el fitxer línia per línia i processa cada línia individualment.
	 * 
	 * @param file Fitxer que conté números separats per espais.
	 */
	public static void readFile(File file) {
		try (Scanner scanner = new Scanner(file)) {
			int numLine = 1;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				checkingLine(line, numLine);
				numLine++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: no s'ha trobat el fitxer.");
		}
	}

	/**
	 * Processa una línia del fitxer, calcula la mitjana dels valors numèrics i gestiona errors de format.
	 * 
	 * @param line Línia de text amb números separats per espais.
	 * @param numLine Número de línia actual del fitxer.
	 */
	public static void checkingLine(String line, int numLine) {
		try {
			String[] numbers = line.split(" ");
			int sum = calcSum(numbers);
			int capacity = numbers.length;
			double average = (double) sum / capacity;

			System.out.println("Línia " + numLine + ": Mitjana = " + average);
		} catch (NumberFormatException e) {
			System.out.println("Error a la línia " + numLine + ": valor no numèric.");
		}
	}

	/**
	 * Calcula la suma dels valors numèrics continguts en un array de Strings.
	 * 
	 * @param numbers Array de Strings que representen números enters.
	 * @return La suma de tots els valors convertits a enters.
	 * @throws NumberFormatException Si algun valor no és numèric.
	 */
	public static int calcSum(String[] numbers) {
		int sum = 0;
		for (String num : numbers) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
