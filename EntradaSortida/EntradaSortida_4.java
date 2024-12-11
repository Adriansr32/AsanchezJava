package EntradaSortida;
import java.util.Scanner;
public class EntradaSortida_4 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);
System.out.println("Escriu tres ciutats");
System.out.print("Primera ciutat: ");
String a = in.nextLine	();
System.out.print("Segona ciutat: ");
String b = in.nextLine();
System.out.print("Tercera Ciutat: ");
String c = in.nextLine();
System.out.println();
System.out.println("+--------------------------------------------------+");
System.out.printf("| 1 | %46s%n", a + " |");
System.out.printf("| 2 | %46s%n", b + " |");
System.out.printf("| 3 | %46s%n", c + " |");
System.out.println("+--------------------------------------------------+");
<<<<<<< HEAD
=======
in.close();
>>>>>>> a127d31bd2d72ee41bfa80f04367c5d67760a3ef
}
}