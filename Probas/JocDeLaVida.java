package Probas;
import java.util.Random;
public class JocDeLaVida {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[][] m = new int[3][3];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j] = ran.nextInt(2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m[i][j] != 3) {
					
				}
			}
		}

	}

}
