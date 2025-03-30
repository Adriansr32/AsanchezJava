package utilities;
import java.util.*;
public class Password2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quants passwords vols generar: ");
		int numPasswords = in.nextInt();
		Password[] passwords = new Password[numPasswords];
		
        for (int i = 0; i < numPasswords; i++) {
            System.out.print("Quina llargada vols per al password " + (i + 1) + "? ");
            int longitud = in.nextInt();
            passwords[i] = new Password(longitud);
        }
        System.out.println("\nContrassenyes generades:");
        for (Password password : passwords) {
            System.out.println("Password: " + password.getContrasenya() + " - És forta: " + password.esForta());
        }

        in.close();
	}    

}
