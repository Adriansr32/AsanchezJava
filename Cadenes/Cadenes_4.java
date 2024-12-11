package Cadenes;
<<<<<<< HEAD
public class Cadenes_4 {

	public static void main(String[] args) {
=======
import java.util.Scanner;
public class Cadenes_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
		// 4.- Escriu un programa que donades dues cadenes retorni una versió de la primera cadena on totes les instàncies de la segona (no case sensitive) han estat eliminades.
		// Introdueix cadena: En quin tinter té tinta Anton
		// Elimina: in
		// Resultat: En qu tter té tta Anton
<<<<<<< HEAD

=======
		System.out.print("Introdueix una cadena: ");
		String c = in.nextLine();
		System.out.print("Elimina: ");
		String e = in.nextLine();
		
		String[] paraules = c.split(e);
		System.out.print("Resultat: ");
		for (int i = 0; i < paraules.length; i++) {
		 System.out.print(paraules[i]);
		}
		in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
	}

}
