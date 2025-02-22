package metodos_1;

public class Metodos1_5 {

	public static void main(String[] args) {
		String[] str = {"hola", "buenos", "dias","como","estas?"};
		
		for (String arg : str) {
			System.out.println("cadena de " + arg);
			System.out.println("Caracters centrals: " + caractersCentrals(arg));
		}
	}
	public static String caractersCentrals(String str) {
		int n = str.length();
		
		if (n % 2 == 1) {
			return String.valueOf(str.charAt(n / 2));
		} else {
			return str.substring(n / 2 - 1, n / 2 + 1);
		}
	}

}
