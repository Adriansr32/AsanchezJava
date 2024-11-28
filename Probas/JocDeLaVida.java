package Probas;
import java.util.Random;

public class JocDeLaVida {

    public static void main(String[] args) {
        Random ran = new Random();
        
        int[][] m = new int[3][3];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ran.nextInt(2); // 0 o 1
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Siguiente generacion:");
        
        int[][] siguienteGeneracion = new int[m.length][m[0].length];
        int vecinosVivos = 0;

        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (x == 0 && y == 0) continue; 
                        
                        int nuevaFila = i + x;
                        int nuevaColumna = j + y;
                        
                        if (nuevaFila >= 0 && nuevaFila < m.length && nuevaColumna >= 0 && nuevaColumna < m[0].length) {
                            vecinosVivos += m[nuevaFila][nuevaColumna];
                        }
                    }
                }
                
                if (m[i][j] == 1) {
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        siguienteGeneracion[i][j] = 1; 
                    } else {
                        siguienteGeneracion[i][j] = 0; 
                    }
                } else {
                   
                    if (vecinosVivos == 3) {
                        siguienteGeneracion[i][j] = 1; 
                    }
                }
            }
        }

   
        for (int i = 0; i < siguienteGeneracion.length; i++) {
            for (int j = 0; j < siguienteGeneracion[i].length; j++) {
                System.out.print(siguienteGeneracion[i][j] + " ");
            }
            System.out.println();
        }
    }
}
