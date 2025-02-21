package examen2_1;
import java.util.Scanner;

public class sentences {
    public static int Paraules(String Frase, String Paraula) {
        String[] paraula1 = Frase.split(" ");
        int contador = 0;
        
        for (String paraula : paraula1) {
            if (paraula.contains(Paraula)) {
                contador++;
            }
        }
        
        return contador; 
    }

    public static String Reverse(String Frase) {
        String reversed = new StringBuilder(Frase).reverse().toString();
        return reversed; 
    }
    
    public static String askParaula(Scanner in, String question) {
        Scanner in1 = new Scanner(System.in);
        String paraula = null;
        boolean valid = false;
        while (!valid) {
            System.out.println(question); 
            System.out.print(">>> ");
            if (in1.hasNextLine()) {
                paraula = in1.nextLine();
                valid = true;  
            } else {
                System.out.println("op no vàlida. Torna-ho a provar.");
                in1.next();  
            }
        }
        return paraula;  
    }
}