package Tasca8;
import java.util.Scanner;
import java.util.Random;
public class Tasca8_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
	
		boolean longitut = false;
		int l = 0;
		while (!longitut) {
			System.out.print("Especifica la longitud de la matriu [2 - 100]: ");
			l = in.nextInt();
			if (l > 1 && l < 101) {
				longitut = true;
			} 
		}
		
		int[] m = new int[l];
		
		int parell = 0;
		int senars = 0;
		for (int i = 0; i < l; i++) {
			m[i] = ran.nextInt(100);
			if (m[i] % 2 == 0) {
				parell++;
			} else {
				senars++;
			}
		}
		System.out.print("Matriu generada: [");
        for (int i = 0; i < m.length - 1; i++) {
            System.out.print(m[i] + ", ");
        	
    	}
            System.out.println(m[m.length - 1] + "]");
            
        System.out.print("Contingut dels índexs senars: [");
        boolean primerImpres = false;
        for (int i = 1; i < m.length; i += 2) {
            if (primerImpres) System.out.print(", ");
            System.out.print(m[i]);
            primerImpres = true;
        }
        System.out.println("]");
        
        int[] mS = new int[senars];
        int indexS = 0;
        System.out.print("Elements senars: [");
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 != 0) {
                mS[indexS++] = m[i];
                System.out.print(m[i] + (indexS < senars ? ", " : ""));
            }
        }
        System.out.println("]");
        
        		int[] mP = new int[parell];
        		int indexP = 0; 
                System.out.print("Elements parells: [");
                for (int i = 0; i < m.length; i++) {
                    if (m[i] % 2 == 0) {
                        mP[indexP++] = m[i];
                        System.out.print(m[i] + (indexP < parell ? ", " : ""));
                    }
                }
                System.out.println("]");

                
                System.out.print("Matriu en ordre invers: [");
                for (int i = m.length - 1; i > 0; i--) {
                    System.out.print(m[i] + ", ");
                }
                System.out.println(m[0] + "]");

                
                System.out.print("Primer i últim element: [");
                System.out.print(m[0] + ", " + m[m.length - 1]);
                System.out.println("]");
         in.close();
	}
}