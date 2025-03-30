package Bucles;
import java.util.Scanner;

public class Bucles_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix un número per calcular el seu factorial: ");
        int n = in.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.printf("El factorial de %d és: %d%n", n, factorial);

        in.close();
    }
}
