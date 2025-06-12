package metodos;

import java.util.*;

public class Lavabo {
	static ArrayList<String> wc = new ArrayList<>();

	public static void main(String[] args) {
		runMenu();
	}
	
	public static void runMenu() {
		Scanner sc = new Scanner(System.in);
		boolean ter = false;
		int op = 0;
		while (!ter) {
			menu();
			op = askOp(sc);

			switch (op) {
			case 1:
				System.out.println(queryUsage());
				break;
			case 2:
				System.out.println(queryLastUsage());
				break;
			case 3:
				System.out.println(queryUsageByStudent(askStudent(sc)));
				break;
			case 4:
				System.out.println(queryTotalUsage());
				break;
			case 5:
				if (askWc(askStudent(sc))) {
					System.out.println("Puedes entrar!");
				} else {
					System.err.println("Ya has entrado pesao!");
				}
				break;
			case 6:
				ter = exit();
				break;
			default:
				System.err.println("Opció no valida. Torna-ho provar.");
				break;
			}

		}
	}

	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Consultar llista. ");
		System.out.println("2. Consultar últim alumne ");
		System.out.println("3. Recompte ús del lavabo per alumne ");
		System.out.println("4. Recompte ús del lavabo ");
		System.out.println("5. Solicitar anar al lavabo ");
		System.out.println("6. Exit");
	}

	public static boolean askWc(String alumne) {
		if (queryUsageByStudent(alumne) < 3) {
			wc.add(alumne);
			return true;
		} else {
			return false;
		}
	}

	public static String queryUsage() {
		if (wc.isEmpty()) {
			return "No hi ha alumnes";
		}
		StringBuilder rs = new StringBuilder();
		for (int i = 0; i < wc.size() - 1; i++) {
			rs.append(wc.get(i)).append(", ");
		}
		rs.append(wc.get(wc.size() - 1)).append(".");

		return rs.toString();
	}

	public static String queryLastUsage() {
		if (wc.size() > 0) {
			return wc.getLast();
		} else {
			return "";
		}
	}

	public static int queryUsageByStudent(String alumne) {
		int count = 0;
		for (String al : wc) {
			if (al.equals(alumne)) {
				count++;
			}
		}
		return count;
	}

	public static String queryTotalUsage() {
		StringBuilder rs = new StringBuilder();
		ArrayList<String> alreadySeen = new ArrayList<String>();
		for (String student : wc) {
			if (!alreadySeen.contains(student)) {
				rs.append(student + " -> " + queryUsageByStudent(student) + ",\n");
				alreadySeen.add(student);
			}
		}

		return rs.toString();
	}

	public static int askOp(Scanner sc) {
		int option = 0;
		boolean valid = false;
		System.out.println("Introdueix una opció: ");
		System.out.print(">> ");
		while (!valid) {
			option = askInt(sc);
			if (option >= 1 && option <= 6) {
				valid = true;
			} else {
				System.err.println("La opció ha d'estar entre 1 i 6");
			}
		}
		return option;
	}

	public static int askInt(Scanner sc) {
		int num = 0;
		boolean valid = false;
		System.out.println("Introdueix un número: ");
		System.out.print(">> ");
		while (!valid) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				sc.nextLine();
				valid = true;
			} else {
				System.err.println("Opció no valida. Torna-ho a provar.");
				sc.next();
			}
		}
		return num;
	}

	public static String askString(Scanner sc) {
		System.out.println("Introdueix un string: ");
		System.out.print(">> ");
		return sc.nextLine();
	}

	public static String askStudent(Scanner sc) {
		System.out.println("Introdueix el nom del estudiant: ");
		System.out.print(">> ");
		return sc.nextLine().toLowerCase();
	}

	public static boolean exit() {
		return true;
	}
}
