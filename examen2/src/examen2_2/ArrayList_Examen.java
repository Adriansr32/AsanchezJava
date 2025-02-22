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
	static ArrayList<String> Alumnes = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int op = 0;
		boolean ter = false;
		while (!ter) {
			menu();
			
			op = askOp(in, "Introdueix una opció: ");
			switch (op) {
			 case 1:
	                System.out.println(AlumnesLlistad(Alumnes));
	                break;
	            case 2:
	                System.out.println(ultimAlumne(Alumnes));
	                break;
	            case 3:
	                String name = askIn(in, "Introdueix un nom: ");
	                System.out.println("La alumne ha anat " + RecomptePerAlumne(Alumnes, name) + " vegades al lavabo");
	                break;
	            case 4:
	                System.out.println(RecompteAlumnes(Alumnes));
	                break;
	            case 5:
	                String name1 = askIn(in, "Introduex el teu nom: ");
	                if (RecomptePerAlumne(Alumnes, name1) < 3) {
	                	Solicitar(Alumnes, name1);
	                	System.out.println("Pots entrar!");
	                } else {
	                	System.out.println("No pots anar mes de 3 vegadas, cagon!");
	                }
	                break;
	            case 6:
	                ter = Exit();
	                break;
	            default:
	                System.out.println("opció no vàlida");
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
	public static String AlumnesLlistad(ArrayList<String> alumnes) {
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < alumnes.size() - 1; i++) {
	        result.append(alumnes.get(i)).append(", ");
	    }
	    result.append(alumnes.get(alumnes.size() - 1)).append(".");
	    return result.toString();
	}

	public static String ultimAlumne(ArrayList<String> alumnes) {
	    int ultim = alumnes.size();
	    return alumnes.get(ultim - 1);
	}

	public static int RecomptePerAlumne(ArrayList<String> alumnes, String name) {
	    int contador = 0;
	    for (String alumna : alumnes) {
	        if (alumna.equals(name)) {
	            contador++;
	        }
	    }
	    return contador;
	}

	public static String RecompteAlumnes(ArrayList<String> alumnes) {
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < alumnes.size(); i++) {
	        String alumne = alumnes.get(i);
	        boolean jaComptat = false;

	        for (int j = 0; j < i; j++) {
	            jaComptat = jaComptat || alumnes.get(j).equals(alumne);
	        }

	        if (!jaComptat) {
	            int contador = 0;
	            for (int j = 0; j < alumnes.size(); j++) {
	                if (alumnes.get(j).equals(alumne)) {
	                    contador++;
	                }
	            }
	            result.append(alumne).append(" -> ").append(contador).append("\n");
	        }
	    }
	    return result.toString();
	}

	public static void Solicitar(ArrayList<String> alumnes, String name) {
	        alumnes.add(name);
	}
	/*
	 * Retorna un true si es exit
	 */
	public static boolean Exit() {
		return true;
	}
	public static int askOp(Scanner in, String question) {
		int num = 0;
		boolean valid = false;
		while (!valid) {
			System.out.println(question);
			System.out.print(">>> ");
			if(in.hasNextInt()) {
				num = in.nextInt();
				valid = true;
			} else {
				System.err.println("Opció no valida. Torna-ho a provar");
				in.next();
			}
		}
		return num;	
	}
	
	public static String askIn(Scanner in, String question) {
		 String paraula = null;
	        boolean valid = false;
	        while (!valid) {
	            System.out.println(question); 
	            System.out.print(">>> ");
	            if (in.hasNextLine()) {
	                paraula = in.nextLine();
	                valid = true;  
	            } else {
	                System.err.println("Ha de ser un String!");
	                in.next();  
	            }
	        }
	        return paraula;  
	    }

}
