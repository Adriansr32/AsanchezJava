package examen2_1;
import java.util.Scanner;

public class numbers {

    public static int sumTwo(int one, int two) {
        return one + two;
    }

    public static int SumUntil(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int askNumber(Scanner in, String question) {
        Scanner in1 = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(question); // Mostramos la pregunta
            System.out.print(">>> ");
            if (in1.hasNextInt()) {
                num = in1.nextInt();
                valid = true;  // Opción válida
            } else {
                System.out.println("op no vàlida. Torna-ho a provar.");
                in1.next();  // Limpiar el buffer
            }
        }
        return num;  // Retornamos el número
    }
}
