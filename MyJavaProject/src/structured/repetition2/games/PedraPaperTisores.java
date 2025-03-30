package Repeticio2;

import java.util.Scanner;

public class Repeticio2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int victoriasJugador = 0;
        int victoriasOrdenador = 0;
        int jugadaJugador;

        do {
            System.out.println("Introdueix 0 per pedra, 1 per paper o 2 per tisores:");
            jugadaJugador = in.nextInt();
            int jugadaOrdinador = (int)(Math.random() * 3);

            String jugadaJugadorStr;
            if (jugadaJugador == 0) {
                jugadaJugadorStr = "pedra";
            } else if (jugadaJugador == 1) {
                jugadaJugadorStr = "paper";
            } else {
                jugadaJugadorStr = "tisores";
            }

            String jugadaOrdinadorStr;
            if (jugadaOrdinador == 0) {
                jugadaOrdinadorStr = "pedra";
            } else if (jugadaOrdinador == 1) {
                jugadaOrdinadorStr = "paper";
            } else {
                jugadaOrdinadorStr = "tisores";
            }

            System.out.println("Ordinador ha tret " + jugadaOrdinadorStr + ". Jugador ha tret " + jugadaJugadorStr + ".");

            if (jugadaJugador == jugadaOrdinador) {	
                System.out.println("És un empat.");
            } else if ((jugadaJugador == 0 && jugadaOrdinador == 2) ||
                       (jugadaJugador == 1 && jugadaOrdinador == 0) ||
                       (jugadaJugador == 2 && jugadaOrdinador == 1)) {
                System.out.println("El jugador guanya.");
                victoriasJugador++;
                System.out.println("El jugador ha guanyat: " + victoriasJugador);
            } else {
                System.out.println("L'ordinador guanya.");
                victoriasOrdenador++;
                System.out.println("L'ordinador ha guanyat: " + victoriasOrdenador);
            }

        } while (victoriasJugador != 3 && victoriasOrdenador != 3);

        if (victoriasJugador == 3) {
            System.out.println("El jugador ha guanyat!!");
            System.out.println("El jugador ha guanyat 3 vegades! ");
        } else {
            System.out.println("L'ordinador Guanya!");
            System.out.println("El ordinador ha guanyat 3 vegades!");
        }

        in.close();
    }
}
