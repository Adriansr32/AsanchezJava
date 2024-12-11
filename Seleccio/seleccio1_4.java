package Seleccio;
import java.util.Scanner;

public class seleccio1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Introdueix el primer número: ");
        double num1 = in.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double num2 = in.nextDouble();

        num1 = Math.round(num1 * 100.0) / 100.0;
        num2 = Math.round(num2 * 100.0) / 100.0;

        if (num1 == num2) {
            System.out.println("Els dos números són iguals.");
        } else {
            System.out.println("Els dos números no són iguals.");
        }
<<<<<<< HEAD
=======
        in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
    }
}
