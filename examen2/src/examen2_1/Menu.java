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
                	int num1 = numbers.askNumber(in, "Introdueix un numero: ");
                	int num2 = numbers.askNumber(in, "Introdueix un numero: ");
                	System.out.println(numbers.sumTwo(num1, num2));
                    break;
                case 3:
                    int num3 = numbers.askNumber(in, "Introdueix un numero: ");
                    System.out.println("La suma fins a " + num3 + " és: " + numbers.SumUntil(num3));
                    break;
                case 4:
                	String frase = sentences.askParaula(in, "Introdueix una frase: ");
                	String paraula = sentences.askParaula(in, "Introdueix una paraula: ");
                    System.out.println("Quantes " + paraula + " hi ha en aquesta frase: " + sentences.Paraules(frase, paraula));
                    break;
                case 5:
                	String frase1 = sentences.askParaula(in, "Introdueix una frase: ");
                    System.out.println("La frase invertida es: " + sentences.Reverse(frase1));
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
        int op = 0;
        boolean valid = false;
        while (!valid) {  // Bucle para asegurar que se ingresa una opción válida
            System.out.println("Introdueix una opció:");
            System.out.print(">>> ");
            if (in.hasNextInt()) {
                op = in.nextInt();
                if (op >= 1 && op <= 6) {
                    valid = true;  // Opción válida
                } else {
                    System.out.println("Opció fora de rang. Torna-ho a provar.");
                }
            } else {
                System.out.println("op no vàlida. Torna-ho a provar.");
                in.next();  // Limpiar el buffer
            }
        }
        return op;
    }

    public static boolean Exit() {
        return true;
    }
}
