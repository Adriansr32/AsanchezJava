package Seleccio;
import java.util.Scanner;
public class seleccio1_2 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);
 System.out.print("Numero del billet: ");
 int billet = in.nextInt();
 
 int numUlt = billet % 10; 
 int noNumUlt = billet / 10;

 if (noNumUlt % 7 == numUlt){
 System.out.println();
 System.out.printf("El numero %d es vàlid", billet);
} else {
 System.out.println();
 System.out.printf("El numero %d es invàlid", billet);

}
}
}