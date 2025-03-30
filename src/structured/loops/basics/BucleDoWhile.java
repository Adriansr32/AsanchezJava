package Bucles;
import java.util.Scanner;

public class Bucles_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.print("Entra un enter: ");
int n = in.nextInt();
int a = 1;
do {
System.out.println("Numero: " + a);
a++;
} while (a <= n);

 

in.close();

}
}