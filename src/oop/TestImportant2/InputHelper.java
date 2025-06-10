package examen;

import java.util.*;
public class InputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        int value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); 
                return value;
            } else {
                System.out.println("Error: Ingresa un número entero válido.");
                scanner.next(); 
            }
        }
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
