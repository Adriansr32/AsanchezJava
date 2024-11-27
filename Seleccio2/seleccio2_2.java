package Seleccio2;
import java.util.Scanner;

public class seleccio2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Introdueix el primer número:");
        int num1 = in.nextInt();
        System.out.println("Introdueix el segon número:");
        int num2 = in.nextInt();
        System.out.println("Introdueix el tercer número:");
        int num3 = in.nextInt();

     
        if (num1 > num2 && num2 > num3) {
            System.out.println("Decreixent");
        } else if (num1 < num2 && num2 < num3) {
            System.out.println("Creixent");
        } else {
            System.out.println("Indefinit");
        }

        in.close(); 
    }
}
