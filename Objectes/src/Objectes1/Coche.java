package Objectes1;

class Coche extends Vehiculo {
	private int numeroPuertas;
	
	public Coche(String marca, String modelo, int numeroPuertas) {
		super(marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}
    @Override
    public String toString() {
    	return super.toString() + " | Numero de puertas: " + this.numeroPuertas;
     }
}
