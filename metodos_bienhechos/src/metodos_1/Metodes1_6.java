package metodos_1;
import java.util.*;
public class Metodes1_6 {

	public static void main(String[] args) {
		int dimensio = 5; 
		
		int [][] m = generarMatriu(dimensio);
		mostrarMatriu(m);

	}
	public static int[][] generarMatriu(int dimensio){
		Random n = new Random();
		int[][] matrix = new int[dimensio][dimensio];
		for (int i = 0; i < dimensio; i++) {
			for (int j = 0; j < dimensio; j++) {
				matrix[i][j] = n.nextInt(2);
			}
		}
		return matrix;

	}
	
	public static void mostrarMatriu(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
