package EntradaSortida;
import java.util.Scanner;
public class EntradaSortida_5 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);

 System.out.print("Introdueix un codi ASCII: ");
 int ASCII = in.nextInt();
 char character = (char) ASCII;
 System.out.printf("El caràcter és: %c%n", character);

 in.close();

}
}