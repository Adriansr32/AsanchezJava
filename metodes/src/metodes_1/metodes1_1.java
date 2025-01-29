package metodes_1;

public class metodes1_1 {

	    public static void main(String[] args) {
	       /**
	        * @author Adrian_Sanchez
	        * @return Pues el test supongo
	        */
	    	testSumaRang();
	    }

	    public static int sumaRang(int limit1, int limit2) {
	        /**
	         * @author Adrian_Sanchez
	         * @return Fa la suma del rang
	         */
	    	
	    	int suma = 0;
	        if (limit1 > limit2) {
	            int temp = limit1;
	            limit1 = limit2;
	            limit2 = temp;
	        }
	        for (int i = limit1; i <= limit2; i++) {
	            suma += i;
	        }
	        return suma;
	    }

	    public static void testSumaRang() {
	    	/**
	    	 * @author Adrian_Sanchez
	    	 * @return "Imprimim" els numeros
	    	 */
	        comprovarSumaRang(4, 7, 22);
	        comprovarSumaRang(-2, 5, 12);
	        comprovarSumaRang(-2, -5, -14);
	        comprovarSumaRang(-5, -2, -14);
	        comprovarSumaRang(7, 7, 14);
	        comprovarSumaRang(5, 2, 14);
	    }

	    public static void comprovarSumaRang(int limit1, int limit2, int resultatEsperat) {
	    	/**
	    	 * @author Adrian_Sanchez
	    	 * @return Imprimim el test
	    	 */
	        System.out.printf("sumaRang(%d, %d) -> %d  ", limit1, limit2, resultatEsperat);
	        if (resultatEsperat != sumaRang(limit1, limit2)) {
	            System.out.println("Test KO!!!");
	        } else {
	            System.out.println("Test OK");
	        }
	    }
	}
