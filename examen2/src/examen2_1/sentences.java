package examen2_1;
import java.util.Scanner;

public class sentences {
    public static void Paraules() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        System.out.print(">>> ");
        String paraulas = in.nextLine();
        System.out.println("Introdueix una paraula: ");
        String paraula2 = in.nextLine();
        
        String[] paraula1 = paraulas.split(" ");
        int contador = 0;
        
        for (String paraula : paraula1) {
            if (paraula.contains(paraula2)) {
                contador++;
            }
        }
        
        System.out.println("La paraula apareix " + contador + " vegades.");
    }

    public static void Reverse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix una frase: ");
        System.out.print(">>> ");
        String frase = in.nextLine();
        String reversed = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase invertida: " + reversed);
    }
}
