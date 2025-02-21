package interfaces123;

public class Coche implements Vehiculo {

	@Override
	public void acelerar() {
		System.err.println("El coche acelera 100 km/h");
	}

	@Override
	public void frenar() {
		System.out.println("El coche frena suavemente");
	}

}
