package Repeticio;
import java.util.Scanner;

public class Repeticio_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean f = false;
        boolean c = false;
        int files = 0;
        while (!f) {
            System.out.print("Introdueix el nombre de files (entre 3 i 30): ");
            files = in.nextInt();
            if (files >= 3 && files <= 30) {
            	f = true;
            }
        }
        
        int columnes = 0;
        while (!c) {
            System.out.print("Introdueix el nombre de columnes (entre 3 i 30): ");
            columnes = in.nextInt();
            if (columnes >= 3 && columnes <= 30) {
            	c = true;
            }
        }

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
