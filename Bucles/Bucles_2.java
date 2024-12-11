package Bucles;
import java.util.Scanner;

public class Bucles_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

System.out.print("Escriu un número Enter: ");
int n = in.nextInt();

int i;
for (i = 1; i <= n; i = i + 1) {
 System.out.printf("Numero: %d%n", i);

 in.close();

}

}
}