package examen;
import java.util.Scanner;
public class Deteccio_Estels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.print("Introdueix les files: ");
		int n = in.nextInt();
		System.out.print("Introdueix les columnes: ");
		int m = in.nextInt();
		boolean s = false; 
		float t = 0;
		while (!s) {
			System.out.print("Introdueix el llinder [0.0 - 100.0] ");
			t = in.nextFloat();
			if (t > 0.0 && t < 101.0) {
				s = true;
			} else {
				System.out.println("El numero ha de ser entre 0.0 - 100.0!");
			}
		}

		
		float[][] m1 = new float[n][m];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j] = (float) (Math.random()*100);
			}
		}
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.printf("%.2f ", m1[i][j] );
			}
			System.out.println();
		}
		
		float[][] estels = new float[m1.length][m1[0].length];
		int vecintsSuperiors = 0;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				for (int x = -1; x == m1.length - 1; x--) {
					for (int y = -1; y == m1[0].length - 1; y--) {
						if (x == 0 && y == 0) continue;
						
						int f = i + x;
						int c = j + y;
						
						if (f <= 0 && f >= m1.length && c <= 0 && c >= m1.length) {
							if (f > t && c > t) {
								vecintsSuperiors += m1[f][c];
							}
						}
					
					}
				}		
			}
			if (vecintsSuperiors == 0 ) {
				System.out.println("No hi ha estrelles");
			}

		}
		
	}

}
