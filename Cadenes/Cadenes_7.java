package Cadenes;
import java.util.Scanner;
public class Cadenes_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 7.- Escriu un programa que demani un nombre enter positiu i mostri la seva representació en binari. Recorda comprovar que el nombre entrat és positiu. Cal fer-ho anant dividint per 2, no es poden utilitzar els mètodes inclosos al llenguatge Java, Integer.toBinaryString(int).
		
		boolean np = false;
		int n = 0;
		
		while (!np) {
			System.out.print("Introdueix un numero positiu: ");
			n = in.nextInt();
			
				if (n <= 0) {
					System.out.println("Numero negatiu, entra un altre!");
				} else {
					np = true;
			}
		}
			
	        StringBuilder binari = new StringBuilder();
	        while (n > 0) {
	            binari.insert(0, n % 2);  
	            n = n / 2;  
	        }
	        
	        System.out.println("La representació en binari és: " + binari.toString());
	        
	        in.close();
	    }
	}