package Seleccio2;
import java.util.Scanner;

public class seleccio2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un nombre entre 50 i 60:");
        int numero = in.nextInt();
        String numerosRomans;

        switch (numero) {
            case 50:
                numerosRomans = "L";
                break;
            case 51:
                numerosRomans = "LI";
                break;
            case 52:
                numerosRomans = "LII";
                break;
            case 53:
                numerosRomans = "LIII";
                break;
            case 54:
                numerosRomans = "LIV";
                break;
            case 55:
                numerosRomans = "LV";
                break;
            case 56:
                numerosRomans = "LVI";
                break;
            case 57:
                numerosRomans = "LVII";
                break;
            case 58:
                numerosRomans = "LVIII";
                break;
            case 59:
                numerosRomans = "LIX";
                break;
            case 60:
                numerosRomans = "LX";
                break;
            default:
                numerosRomans = null;
        }

        if (numerosRomans != null) {
            System.out.println("El nombre " + numero + " en números romans és: " + numerosRomans);
        } else {
            System.out.println("Error: El nombre no està entre 50 i 60.");
        }

        in.close();
    }
}
