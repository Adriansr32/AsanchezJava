package metodos_2;
import java.util.*;
public class Metodos2_1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una frase:");
        String frase = in.nextLine();

        String fraseBarrejada = barrejarFrase(frase);
        System.out.println("Frase barrejada:");
        System.out.println(fraseBarrejada);

        in.close();
	}
	
	public static String barrejarParaula(String paraula) {
		if (paraula.length() <= 3) {
			return paraula;
		}
		char[] lletres = paraula.toCharArray();
		Random r = new Random();
		int n = lletres.length;
		
        boolean[] usat = new boolean[n];
        usat[0] = true; 
        usat[n - 1] = true;
        
        for (int i = 1; i < n - 1; i++) {
        	int j;
        	do {
        		j = 1 + r.nextInt(n - 2);
        	} while (usat[j]);
        	
        	char temp = lletres[i];
        	lletres[i] = lletres[j];
        	lletres[j] = temp;
        	usat[j] = true;
        }
        
        return new String(lletres);
	}
	
	public static String barrejarFrase(String frase) {
		String[] paraules = frase.split(" ");
		Random random = new Random();
		int n = paraules.length;

		String[] desarreglat = new String[n];
		boolean[] usat = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			int j;
			do {
				j = random.nextInt(n);	
			} while(j == i || usat[j]);
			desarreglat[i] = paraules[j];
			usat[j] = true;
		}
		
		StringBuilder resultat = new StringBuilder();
		for (String paraula : desarreglat) {
		    resultat.append(paraula).append(" ");
		}
		
		return resultat.toString().trim();
	}

}
