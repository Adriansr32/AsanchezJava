package interfaces123;

public class Main {

	public static void main(String[] args) {
		Coche coche = new Coche();
		Bicicleta bicicleta = new Bicicleta();
		
		coche.acelerar();
		bicicleta.acelerar();
		coche.frenar();
		bicicleta.frenar();
	}

}
