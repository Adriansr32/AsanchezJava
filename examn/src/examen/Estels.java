package examen;

import java.util.Scanner;


public class Estels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		float T;
		float [][] matrix;
		
		System.out.print("Introdueix el número de línies (N):");
		N = sc.nextInt();
		System.out.print("Introdueix el número de columnes (M):");
		M = sc.nextInt();
		System.out.print("Introdueix el llindar mínim (T):");
		T = sc.nextFloat();
		
		// Fill and show matrix
		System.out.println("Matriu generada:");
		matrix = new float[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				matrix[i][j] = (float) (Math.random()*100);
				System.out.printf("%5.2f ",matrix[i][j]);
			}
			System.out.println();
		}
		
		// Search stars
		int foundStars = 0;
		for(int i=1; i<N-1; i++) {
			for(int j=1; j<M-1; j++) {
				if (
					T < matrix[i][j]
					& matrix[i-1][j] < matrix[i][j]
					& matrix[i][j-1] < matrix[i][j]
					& matrix[i+1][j] < matrix[i][j]
					& matrix[i][j+1] < matrix[i][j]
				) {
					if( foundStars == 0) {
						System.out.println("S'han trobat les següents estrelles:");
					}
					System.out.println("("+i+","+j+")");
					foundStars++;
				}
			}
		}
		if(foundStars == 0) {
			System.out.println("No s'ha trobat cap estrella.");
		}
	
	}

}
