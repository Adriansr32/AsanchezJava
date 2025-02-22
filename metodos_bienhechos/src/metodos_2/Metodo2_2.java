package metodos_2;
import java.util.*;
public class Metodo2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		llegirFinsDouble(in, "introdueix un número: ");


	}
	
	public static double llegirFinsDouble(Scanner in, String prompt) {
		Scanner in1 = new Scanner(System.in);
		boolean valid = false;
		double p = 0;
		while (!valid) {
			System.out.println(prompt);
			if (in1.hasNextDouble()) {
				p = in1.nextDouble();
				valid = true;
			} else {
				System.err.println("Has d'introduir un Double!");
				System.out.print("Introdueix un numero un altre cop");
				in1.next();
			}
		}
		return p;
	}

}
