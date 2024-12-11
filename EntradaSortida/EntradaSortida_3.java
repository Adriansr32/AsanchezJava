package EntradaSortida;
import java.util.Scanner;
public class EntradaSortida_3 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);

System.out.println("Di dos nombres enters");
System.out.print("Numero uno: ");
int a = in.nextInt();
System.out.print("Numero dos: ");
int b = in.nextInt();
int resultat = a + b;
System.out.println();
System.out.printf("%7d%n", a);
System.out.printf("+%6d%n", b);
System.out.printf("-------%n");
System.out.printf("%7d%n", resultat);
<<<<<<< HEAD

=======
in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef

 }
}