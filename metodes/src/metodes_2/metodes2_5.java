package metodes_2;

import java.util.Scanner;

public class metodes2_5 {

    public static String digitRoma(int n, String u, String cinc, String deu) {
        if (n == 9) {
            return u + deu;
        } else if (n >= 5) {
            return cinc + u.repeat(n - 5);
        } else if (n == 4) {
            return u + cinc;
        } else {
            return u.repeat(n);
        }
    }

    public static String convertirARomans(int numero) {
        String milers = digitRoma(numero / 1000, "M", "", "");
        String centenes = digitRoma((numero / 100) % 10, "C", "D", "M");
        String desenes = digitRoma((numero / 10) % 10, "X", "L", "C");
        String unitats = digitRoma(numero % 10, "I", "V", "X");
        return milers + centenes + desenes + unitats;
    }

    public static String convertirACatala(int numero) {
        String[] unitats = {"", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou"};
        String[] desenes = {"", "deu", "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta"};
        String[] centenes = {"", "cent", "dos-cents", "tres-cents", "quatre-cents", "cinc-cents", "sis-cents", "set-cents", "vuit-cents", "nou-cents"};

        int c = numero / 100;
        int d = (numero / 10) % 10;
        int u = numero % 10;

        String resultat = "";
        if (c > 0) {
            resultat += centenes[c];
        }
        if (d > 0) {
            if (!resultat.isEmpty()) resultat += " ";
            resultat += desenes[d];
        }
        if (u > 0) {
            if (!resultat.isEmpty()) resultat += "-";
            resultat += unitats[u];
        }

        return resultat.trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix un número enter (entre el 1 i el 3999): ");

        while (!in.hasNextInt()) {
            System.out.println("Error: Has d'introduir un número enter.");
            in.next();
            System.out.print("Introdueix un número enter (entre el 1 i el 3999): ");
        }

        int numero = in.nextInt();

        if (numero < 1 || numero > 3999) {
            System.out.println("Error: El número ha d'estar entre 1 i 3999.");
        } else {
            String romans = convertirARomans(numero);
            String catala = convertirACatala(numero);
            System.out.println("En romà: " + romans);
            System.out.println("En català: " + catala);
        }
    }
}
