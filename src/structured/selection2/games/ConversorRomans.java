package Seleccio2;
import java.util.Random;
import java.util.Scanner;

public class seleccio2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Introdueix 0 per pedra, 1 per paper o 2 per tisores:");
        int jugadaJugador = in.nextInt();

        int jugadaOrdinador = rand.nextInt(3);

        String[] opcions = {"pedra", "paper", "tisores"};
        System.out.println("Ordinador ha tret " + opcions[jugadaOrdinador] + ". Jugador ha tret " + opcions[jugadaJugador] + ".");

        if (jugadaJugador == jugadaOrdinador) {
            System.out.println("És un empat.");
        } else if ((jugadaJugador == 0 && jugadaOrdinador == 2) ||
                   (jugadaJugador == 1 && jugadaOrdinador == 0) ||
                   (jugadaJugador == 2 && jugadaOrdinador == 1)) {
            System.out.println("El jugador guanya.");
        } else {
            System.out.println("L'ordinador guanya.");
        }

        in.close();
    }
}
