package cochehhhee;

public class Main {

	    public static void main(String[] args) {
	        Motor motor = new Motor(150);
	        Coche coche = new Coche("Toyota", "Corolla", motor);
	        coche.mostrarInfo();
	    }
	}


