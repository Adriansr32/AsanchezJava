package Repeticio;
import java.util.Scanner;

public class Repeticio_3 {
    public static void main(String[] args) {
        // El bit de paritat és un bit addicional que s'afegeix al final del codi binari per detectar errors en la transmissió. 
        // En aquest cas, s'utilitza paritat imparell, és a dir, el nombre total de '1' (incloent el bit de paritat) ha de ser imparell.
        
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix un codi binari de 8 dígits: ");
        String codi = in.nextLine();
        
        if (codi.matches("[01]{8}")) {
            int comptadorUns = 0;
            for (char bit : codi.toCharArray()) {
                if (bit == '1') {
                    comptadorUns++;
                }
            }
            int bitParitat = (comptadorUns % 2 == 0) ? 1 : 0;
            String codiAmbParitat = codi + bitParitat;
            System.out.println("Codi amb bit de paritat: " + codiAmbParitat);
        } else {
            System.out.println("El codi no és binari o no té 8 bits.");
        }
        
        in.close();
    }
}
