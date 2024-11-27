package Bucles;
import java.util.Scanner;

public class Bucles_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

System.out.print("Escriu un número Enter: ");
int n = in.nextInt();
int a = 1;
while (a <= n ){
System.out.println("Numero: " + a);
a++;
in.close();
}

}
}