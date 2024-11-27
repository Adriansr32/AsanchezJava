package EntradaSortida;
import java.util.Scanner;
public class EntradaSortida_2 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);
 System.out.print("Entra la ciutat inicial: ");
 String	 inici = in.nextLine();
 System.out.print("Entra la ciutat Destí: ");
 String destini = in.nextLine();
 System.out.print("Entra la distància en kms entre les dues ciutats: ");
 double km = in.nextDouble();
 System.out.print("Entra el cost per km: ");
 double cost = in.nextDouble();
 double resultat = km * cost;
 System.out.println("********************************************************");
 System.out.printf("El cost del viatge de Manresa a Barcelona és de %.2f ", resultat);
 }
}