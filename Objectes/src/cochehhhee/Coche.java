package cochehhhee;

public class Coche {
	    private String marca;
	    private String modelo;
	    private Motor motor;

	    public Coche(String marca, String modelo, Motor motor) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.motor = motor;
	    }

	    public void mostrarInfo() {
	        System.out.println("Coche: " + this.marca + " " + this.modelo + " | Motor: " + this.motor.getPotencia());
	    }
	}
