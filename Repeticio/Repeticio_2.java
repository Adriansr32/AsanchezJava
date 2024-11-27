package Repeticio;
import java.util.Scanner;

public class Repeticio_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int files, columnes;

        for (;;) {
            System.out.print("Introdueix el nombre de files (entre 3 i 30): ");
            files = in.nextInt();
            if (files >= 3 && files <= 30) break;
        }

        for (;;) {
            System.out.print("Introdueix el nombre de columnes (entre 3 i 30): ");
            columnes = in.nextInt();
            if (columnes >= 3 && columnes <= 30) break;
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
