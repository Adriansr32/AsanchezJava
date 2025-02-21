package empresa;

public class Programador extends Empleado {
	private String lenguaje;
	public Programador(String name, double sueldo, String lenguaje) {
		super(name, sueldo);
		this.lenguaje = lenguaje;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Lenguaje: " + lenguaje;
 	}

}
