package Seleccio2;
import java.util.Scanner;

public class seleccio2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una quantitat de diners en euros");
        System.out.print("Diners: ");
        int diners = in.nextInt();

        
        in.nextLine(); 

        System.out.println("Introdueix si els vols passar a Dollars(d) o Lliures(l)");
        System.out.print("Dollar o Lliures: ");
        String DL = in.nextLine();

        if (DL.equals("d")) {
           
            double dinersD = diners * 1.08;
            System.out.println("Els diners " + diners + " a dòlars són " + dinersD);
        } else if (DL.equals("l")) {
           
            double dinersL = diners * 0.86;
            System.out.println("Els diners " + diners + " a lliures són " + dinersL);
        } else {
            System.out.println("Opció no vàlida.");
        }

        in.close(); 
    }
}
