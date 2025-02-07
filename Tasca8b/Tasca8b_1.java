package Tasca8b;
import java.util.Scanner;

public class Tasca8b_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
      
        System.out.println("---------- Longitut de la matriu ----------");
        System.out.print("Introdueix un numero: ");
        int n = in.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
