package Repeticio2;
import java.util.Scanner;

public class Repeticio2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int part1 = -1, part2 = -1, part3 = -1, part4 = -1;

        for (int i = 1; i <= 4; i++) {
            int part;
            do {
                System.out.print(i + "a part: ");
                part = in.nextInt();
                
                if (part < 0 || part > 255) {
                    System.out.println("Número fora de rang. Introdueix un valor entre 0 i 255.");
                }
            } while (part < 0 || part > 255);

            if (i == 1) part1 = part;
            else if (i == 2) part2 = part;
            else if (i == 3) part3 = part;
            else if (i == 4) part4 = part;
        }

        String ip = part1 + "." + part2 + "." + part3 + "." + part4;
        System.out.println("L'adreça IP completa és: " + ip);

        if (part1 >= 1 && part1 <= 126) {
            System.out.println("L'adreça IP és de classe A.");
        } else if (part1 >= 128 && part1 <= 191) {
            System.out.println("L'adreça IP és de classe B.");
        } else if (part1 >= 192 && part1 <= 223) {
            System.out.println("L'adreça IP és de classe C.");
        } else if (part1 >= 224 && part1 <= 239) {
            System.out.println("L'adreça IP és de classe D (Multicast).");
        } else if (part1 >= 240 && part1 <= 255) {
            System.out.println("L'adreça IP és de classe E (Experimental).");
        } else {
            System.out.println("L'adreça IP no és vàlida per determinar la classe.");
        }
        in.close();
    }
}

