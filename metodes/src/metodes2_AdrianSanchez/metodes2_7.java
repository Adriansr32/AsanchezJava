package metodes2_AdrianSanchez;
import java.util.Scanner;
public class metodes2_7 {

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Quantes taules de multiplicar vols mostrar? ");
	        int numero = in.nextInt();

	        if (numero < 1) {
	            System.out.println("El número ha de ser superior a 0.");
	        } else {
	            int grups = 4; 
	            for (int i = 1; i <= numero; i += grups) {
	                mostrarGrupTaules(i, Math.min(i + grups - 1, numero));
	                System.out.println(); 
	            }
	        }
	    }

	    public static void mostrarGrupTaules(int inici, int fi) {
	        for (int fila = 1; fila <= 10; fila++) {
	            for (int taula = inici; taula <= fi; taula++) {
	                System.out.printf("%d x %2d = %2d\t", taula, fila, taula * fila);
	            }
	            System.out.println(); 
	        }
	    }
	

	}
