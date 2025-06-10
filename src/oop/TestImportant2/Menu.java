package examen;
import java.util.*;
import examen.InputHelper;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean menu = false;
		NavBar nb = new NavBar();
		while (!menu) {
			menu();
			int op = InputHelper.readInt("Introdueix una opció: ");
			switch (op) {
			case 1:
				String url = InputHelper.readString("Introdueix una url: ");
				nb.navegar(url);
				break;
			case 2:
				nb.enrere();
				break;
			case 3:
				nb.endevant();
				break;
			case 4:
				nb.mostrarURLS();
				break;
			case 5:
				nb.mostrarHistorial();
				break;
			case 6:
				menu = sortir(menu);
				break;
			}
		
		}

	}
	public static void menu() {
		System.out.println("1. Navegar a: ");
		System.out.println("2. Tornar enrere");
		System.out.println("3. Tornar endevant");
		System.out.println("4. Mostrar nombre de visites de cada URL");
		System.out.println("5. Mostrar historial de navegació");
		System.out.println("6. Sortir");
	}
	public static boolean sortir(boolean input) {
		return input = true;
	}
}
