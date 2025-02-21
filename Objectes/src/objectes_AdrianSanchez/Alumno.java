package objectes_AdrianSanchez;

public class Alumno {
	private String nombre;
	private int edad;
	private int notaFinal;
	
	public Alumno(String nombre, int edad, int notaFinal) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaFinal = notaFinal;
	}
	
	public String getNombre(){
		return nombre;
	}
	public boolean esAprobado() {
		if (this.notaFinal >= 5) {
			return true;
		}
		return false;
	}
}
