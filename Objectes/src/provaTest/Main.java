package provaTest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Magatzem magatzem = new Magatzem(3, 3);

        magatzem.afegirBeguda(new Refrescos("R1", 1.0, 1.5, "Coca-Cola", 10.5, true));
        magatzem.afegirBeguda(new Aigua("A1", 1.5, 1.2, "FontViva", "Manantial X"));
        magatzem.afegirBeguda(new Refrescos("R2", 1.2, 1.3, "Fanta", 10.5, false));
        

        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Afegir beguda");
            System.out.println("2. Calcular preu");
            System.out.println("3. Mostrar informació");
            System.out.println("4. Sortir");
            System.out.print("Escull una opció: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Preu total: " + magatzem.calcularPreu());
                    break;
                case 3:
                    magatzem.mostrarInformacio();
                    break;
                case 4:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció invàlida");
            }
        } while (option != 4);

        sc.close();
    }
}
