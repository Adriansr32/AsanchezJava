package metodes1_AdrianSanchez;

import java.util.Random;

public class metodes1_7 {
	public static boolean equals(int[][] a, int[][] b) {
        if (a == null || b == null) {
            return false; 
        }
        
        
        if (a.length != b.length || a[0].length != b[0].length) {
            return false; 
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false; 
                }
            }
        }
        
        return true; 
    }

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
        int dimensio = 3; 
        
        int[][] matriu1 = generarMatriuBinaria(dimensio);
        int[][] matriu2 = generarMatriuBinaria(dimensio);
        
        System.out.println("Matriu 1:");
        mostrarMatriu(matriu1);
        System.out.println("Matriu 2:");
        mostrarMatriu(matriu2);

        System.out.println("Les matrius són iguals? " + equals(matriu1, matriu2));
    }

}