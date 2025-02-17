package examen2_1;
import java.util.Scanner;

public class numbers {
    public static void sumTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int num1 = in.nextInt();
        System.out.println("Introdueix un altre numero: ");
        int num2 = in.nextInt();
        System.out.println("La suma és: " + (num1 + num2));
    }

    public static void SumUntil() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La suma fins a " + num + " és: " + sum);
    }
}
