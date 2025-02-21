package Objectes1;

public class Moto extends Vehiculo {
	private boolean tieneSidecar;
	
	public Moto(String marca, String modelo, boolean tieneSidecar) {
		super(marca, modelo);
		this.tieneSidecar = tieneSidecar;
	}
    @Override
    public String toString() {
    	return super.toString() + " | Tiene sidecar: " + (this.tieneSidecar ? "Sí" : "No");
     }
}
