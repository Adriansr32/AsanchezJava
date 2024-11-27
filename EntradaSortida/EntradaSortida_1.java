package EntradaSortida;
import java.util.Scanner;
public class EntradaSortida_1 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);
 System.out.println("Entra tres números enters:");
 int a = in.nextInt();
 int b = in.nextInt();
 int c = in.nextInt();
 int suma = a + b + c;
 double resultat = suma / 2.0;
 System.out.printf("El resultat de la operació " + "(" + a + "+" + b + "+" + c + ")/2 és %.2f", resultat);
in.close();
 }
 
}