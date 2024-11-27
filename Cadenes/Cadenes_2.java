package Cadenes;
import java.util.Scanner;
public class Cadenes_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 2.- Escriu un programa que demani a l’usuari una lletra i indiqui si és una consonant o una vocal.
		// Entra una lletra: b
		// b és una consonant
		// Entra una lletra: A
		// A és una vocal
		// Entra una lletra: #
		// # no és un caràcter vàlid
		
       
        String v = "aeiou";

        System.out.print("Entra una lletra: ");
        String e = in.nextLine().toLowerCase();

        if (e.length() != 1 || !Character.isLetter(e.charAt(0))) {
            System.out.println(e + " no és un caràcter vàlid");
        } else {
            char ll = e.charAt(0);

          
            if (v.indexOf(ll) != -1) {
                System.out.println(e + " és una vocal");
            } else {
                System.out.println(e + " és una consonant");
            }
        }
        in.close();
    }
}
