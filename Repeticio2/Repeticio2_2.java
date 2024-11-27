package Repeticio2;
import java.util.Scanner;

public class Repeticio2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escriu una frase per encriptar: ");
        String frase = in.nextLine();
        int desplaçament = 1; 
        String fraseEncriptada = ""; 

        for (int i = 0; i < frase.length(); i++) {
            char lletra = frase.charAt(i);

            if (lletra == 'E') { 
                fraseEncriptada += ' '; 
            } else if (lletra == ' ') { 
                fraseEncriptada += 'E'; 
            } else { 
                fraseEncriptada += (char)(lletra + desplaçament); 
            }
        }

        System.out.println("Frase encriptada: " + fraseEncriptada);
        in.close();
    }
}

