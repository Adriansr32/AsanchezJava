package metodes_1;

import java.util.Random;

public class metodes1_6 {
    public static int[][] generarMatriuBinaria(int dimensio) {
        int[][] matriu = new int[dimensio][dimensio];
        Random random = new Random();
        
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                matriu[i][j] = random.nextInt(2); 
            }
        }
        return matriu;
    }

    public static void mostrarMatriu(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int dimensio = 5; 
        
        int[][] matriu = generarMatriuBinaria(dimensio);
        
        System.out.println("Matriu binària generada:");
        mostrarMatriu(matriu);
    }
}