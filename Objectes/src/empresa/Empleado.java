package empresa;

public class Empleado {
	private String name;
	private double sueldo;
	
	public Empleado(String name, double sueldo) {
		this.name = name;
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return "Nombre: " + name + " | " + " Sueldo base: " + sueldo;
	}
}
