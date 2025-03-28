package interfaces123;

public class Bicicleta implements Vehiculo {

	@Override
	public void acelerar() {
	System.out.println("La bicicleta acelera a 20km/h");
	}

	@Override
	public void frenar() {
		System.err.println("La bicicleta acelera bruscamente");
	}

}
