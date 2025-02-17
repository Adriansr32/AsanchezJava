package examen2_1;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ter = false;
        int op;
    
        while (!ter) {
            menu();
            
            op = op(in);
    
            switch (op) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    numbers.sumTwo();
                    break;
                case 3:
                    numbers.SumUntil();
                    break;
                case 4:
                    sentences.Paraules();
                    break;
                case 5:
                    sentences.Reverse();
                    break;
                case 6:
                    ter = Exit();
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
                    
            }
        }
        in.close();
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Print \"Hello World\"");
        System.out.println("2. Sum two numbers.");
        System.out.println("3. Sum numbers until n.");
        System.out.println("4. Count words.");
        System.out.println("5. Reverse sentence.");
        System.out.println("6. Exit");    
    }

    public static int op(Scanner in) {
        System.out.println("Introdueix una opció:");
        System.out.print(">>> ");
        if (in.hasNextInt()) {
        	return in.nextInt();
        } else {
        	System.out.println("op no valida");
        }
		return 0;
    }

    public static boolean Exit() {
        return true;
    }
}
