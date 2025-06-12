package metodos2;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		runMenu();

	}
	public static void runMenu() {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		boolean ter = false;
		
		while(!ter) {
			menu();
			op = askOp(sc);
			switch(op) {
			case 1:
				System.out.println(helloWorld());
				break;
			case 2:
				System.out.println(Numbers.sum(askInt(sc), askInt(sc)));
				break;
			case 3:
				System.out.println(Numbers.sumUntil(askIntGreaterOrEqualThan(sc, 0)));
				break;
			case 4:
				System.out.println(Sentences.countWords(askString(sc), askString(sc)));
				break;
			case 5:
				System.out.println(Sentences.reverse(askString(sc)));
				break;
			case 6:
				ter = exit();
				break;
			default:
				System.err.println("Opció no valida, torna-ho a provar");
				break;
			}
		}
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
    
    public static String helloWorld() {
    	return "Hello world";
    }
    
    public static boolean exit() {
    	return true;
    }
    
    public static int askInt(Scanner sc) {
    	int num = 0;
    	boolean valid = false;
  		System.out.println("Introdueix un número: ");
		System.out.print(">> ");
    	while(!valid) {
    		if(sc.hasNextInt()) {
    			num = sc.nextInt();
    			sc.nextLine();
    			valid = true;
    		} else {
    			System.err.println("Opció no valida, torna-ho a provar.");
    		}
    	}
    	return num;
    }
    
    public static String askString(Scanner sc) {
    	System.out.println("Introdueix un String: ");
    	return sc.nextLine();
    }
    
    public static int askOp(Scanner sc) {
    	int option = 0;
    	boolean valid = false;
    	while(!valid) {
    		option = askInt(sc);
    		if(option>= 1 && option <= 6 ) {
    			valid = true;
    		} else {
    			System.err.println("La opción deberia de estar entre 1 y 6");
    		}
    	}
    	return option;
    }
    
    public static int askIntGreaterOrEqualThan(Scanner sc, int threshold) {
    	int n = 0;
    	boolean valid = false;
    	System.out.println("Introdueix un número mayor o igual que " + threshold + ":");
    	while(!valid) {
    		n = askInt(sc);
    		if (n>= threshold) {
    			valid = true;
    		} else {
    			System.err.println("L'opció ha de ser major o igual que " + threshold + ":");
    		}
    	}
    	return n;
    }
}
