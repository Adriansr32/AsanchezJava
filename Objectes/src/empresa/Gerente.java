package empresa;

public class Gerente extends Empleado { 
	private int bono;
	public Gerente(String name, double sueldo, int bono) {
		super(name, sueldo);
		this.bono = bono;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Bono: " + bono;
	}
}
