package Recursivitat;

public class Recursivitat_1 {

    public static void main(String[] args) {
        int i = 5; 
        double resultat = Cs(i);
        System.out.println("El resultat de la sèrie per a i = " + i + " és: " + resultat);
    }

    public static double Cs(int i) {
        if (i == 1) {
            return 1.0; 
        } else {
            return Cs(i - 1) + 1.0 / i;
        }
    }
}
