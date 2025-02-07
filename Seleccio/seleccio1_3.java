package Seleccio;
import java.util.Scanner;

public class seleccio1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix un número entre 0 i 99999: ");
        int num = in.nextInt();
 	int xifres = String.valueOf(num).length();
        
	if (num >= 0 & num <= 99999) {
	System.out.println("El número " + num + " té " + xifres + " xifres.");
            
        } else {
            System.out.println("Error: El número ha d'estar entre 0 i 99999.");

	System.exit(0);
}

in.close();
    }
}
