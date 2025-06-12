package examen2;

import java.util.*;

/*
 * Un programa que demana un numero i ho fa al invers
 * 
 * @author Adrian Sanchez
 * @version 1.0
 * @since 07/02/2025
 */
public class Recursivitat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entra un número per ser invertit:");
        System.out.print(">>> ");
        int num = in.nextInt();
        
        int numInvertit = recursiu(num, 0);
        System.out.println("El número invertit és: " + numInvertit);
    }

    public static int recursiu(int num, int invertit) {
        if (num == 0) {
            return invertit;
        } else {
            int digit = num % 10;
            return recursiu(num / 10, invertit * 10 + digit);
        }
    }
}