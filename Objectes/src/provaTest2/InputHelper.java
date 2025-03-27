package provaTest2;
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

    public static float readFloat(String message) {
        float value;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextFloat()) {
                value = scanner.nextFloat();
                scanner.nextLine(); 
                return value;
            } else {
                System.out.println("Error: Ingresa un número decimal válido.");
                scanner.next(); 
            }
        }
    }

    public static boolean readBoolean(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextBoolean()) {
                boolean value = scanner.nextBoolean();
                scanner.nextLine(); 
                return value;
            } else {
                System.out.println("Error: Ingresa 'true' o 'false'.");
                scanner.next(); 
            }
        }
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
