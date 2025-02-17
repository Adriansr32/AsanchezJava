package examen2_2;

import java.util.*;
/*
 * Un programa per demanar anar al lavabo i emmagatzemar-ho
 * 
 * @author Adrian Sanchez
 * @version 1.0
 * @since 07/02/2025
 */
public class ArrayList_Examen {
	/*
	 * @param nom es vuit
	 * @param Alumnes es l'array d'alumnes
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> Alumnes = Alumnes1();

		int op = 0;
		boolean ter = false;
		while (!ter) {
			menu();
			
			System.out.println("Introdueix una opcio: ");
			op = in.nextInt();
			switch (op) {
			case 1:
				AlumnesLlistad(Alumnes);
				break;
			case 2:
				ultimAlumne(Alumnes);
				break;
			case 3:
				RecomptePerAlumne(Alumnes);
				break;
			case 4:
				RecompteAlumnes(Alumnes);
				break;
			case 5:
				Solicitar(Alumnes);
				break;
			case 6:
				Exit(ter);
				ter = true;
				break;
			default:
				System.out.println("opcio no valida");
				break;
			}
		}
		
	}
	
	/*
	 * Fa el menu
	 * 
	 */
	public static void menu() {
		
		System.out.println("Menu");
		System.out.println("1. Consultar llista. ");
		System.out.println("2. Consultar últim alumne ");
		System.out.println("3. Recompte ús del lavabo per alumne ");
		System.out.println("4. Recompte ús del lavabo ");
		System.out.println("5. Solicitar anar al lavabo ");
		System.out.println("6. Exit");
	}
	
	/*
	 * Fa els alumnes llistats
	 */
	public static void AlumnesLlistad(ArrayList<String> alumnes) {
		for (int i = 0; i < alumnes.size(); i++) {
			System.out.println(alumnes.get(i));
		}
		
	}
	/*
	 * Fa l'ultim alumne
	 */
	public static void ultimAlumne(ArrayList<String> alumnes) {
		int ultim = alumnes.size();
		System.out.println(alumnes.get(ultim - 1));
	}
	/*
	 * Fa el recomptePerAlumne
	 */
	public static void RecomptePerAlumne(ArrayList<String> alumnes) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introdueix el nom de l'alumne: ");
		String alumne = in.nextLine();
		int contador = 0;
		for ( int i = 0; i < alumnes.size(); i++) {
			if (alumnes.get(i).contains(alumne)) {
				contador++;
			}
		}
		System.out.println("L'alumne ha anat al lavabo " + contador + " vegades");
		
	}
	/*
	 * Fa el recompte de tots els alumnes
	 */
	
	public static void RecompteAlumnes(ArrayList<String> alumnes) {
		int contador1 = 0;
		for ( int i = 0; i < alumnes.size(); i++) {
			if (alumnes.get(i).contains(alumnes.get(i))) {
				contador1++;
			} 
			System.out.println(alumnes.get(i) + " -> " + contador1);
			}
	}
	/*
	 * Solicita el alumne 
	 */
	public static void Solicitar(ArrayList<String> alumnes) {
		Scanner in = new Scanner(System.in);
		String nom;
		System.out.println("Introdueix el teu nom: ");
		nom = in.nextLine();
		int size = alumnes.size();
		alumnes.set(size, nom);
	}
	/*
	 * Afegeix el alumne
	 */
	public static ArrayList<String> Alumnes1()  {
		
		ArrayList<String> Alumnes = new ArrayList<>();

		
		
		return Alumnes;
	}
	/*
	 * Retorna un true si es exit
	 */
	public static boolean Exit(boolean ter) {
		return ter = true;
	}

}
