package metodes_2;

import java.util.Scanner;
public class Metodes2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix un número per generar les taules de multiplicar: ");
        int numero = in.nextInt();

        if (numero < 1) {
            System.out.println("El número ha de ser superior a 0.");
        } else {
            for (int i = 1; i <= numero; i++) {
                mostrarTaula(i);
                System.out.println(); 
            }
        }
        in.close();
    }

    public static void mostrarTaula(int n) {
        System.out.println("Taula del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
