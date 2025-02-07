package Seleccio;
import java.util.Scanner;
public class seleccio1_1 {
 public static void main(String[] args) {
 Scanner in;
 in = new Scanner(System.in);

System.out.println("Posa 3 nombres");
System.out.print("Nombre 1: ");
int num1 = in.nextInt();
System.out.print("Nombre 2: ");
int num2 = in.nextInt();
System.out.print("Nombre 3: ");	
int num3 = in.nextInt();
if (num1 == num2 & num2 == num3) {
System.out.print("tots son iguals");
} else if (num1 != num2 & num2 != num3 & num1 != num3) {
System.out.print("Son tots diferents");

} else {
System.out.print("Ni un ni l'altre");
}



in.close();


}
}