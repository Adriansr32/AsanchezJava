package Cadenes;
import java.util.Scanner;
public class Cadenes_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 8.-Escriu un programa que converteixi un número binari a decimal. No pots utilitzar el mètode Integer.parseInt(num-binari, 2).
	       
        System.out.print("Introdueix un número binari: ");
        String b = in.nextLine();
        
        
        int d = 0;
        int p = 1;
        
        
        for (int i = b.length() - 1; i >= 0; i--) {
            char dI = b.charAt(i);
            
            
            if (dI == '1') {
                d += p;
            }
            
           
            p *= 2;
        }
        
        System.out.println("El número decimal és: " + d);
        
        in.close();
    }
}
