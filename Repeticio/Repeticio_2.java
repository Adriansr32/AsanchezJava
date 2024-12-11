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

        boolean f = false;
        boolean c = false;
        int files1 = 0;
        while (!f) {
            System.out.print("Introdueix el nombre de files (entre 3 i 30): ");
            files1 = in.nextInt();
            if (files1 >= 3 && files1 <= 30) {
            	f = true;
            }
        }
        
        int columnes1 = 0;
        while (!c) {
            System.out.print("Introdueix el nombre de columnes (entre 3 i 30): ");
            columnes1 = in.nextInt();
            if (columnes1 >= 3 && columnes1 <= 30) {
            	c = true;
            }

        }

        for (int i = 0; i < files1; i++) {
            for (int j = 0; j < columnes1; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

      
    }
          

        in.close(); 
       }
   
    }
