package exercicio;


public class Estudiante extends Persona {
	private float nota;
	
	public Estudiante(String nombre, char sexo) {
		super(nombre, sexo);
		this.nota = generarNota();
		generarEdad();
	}
	@Override
	int generarEdad() {
		return super.edad = (int) (Math.random() * 8) + 18;
	}

	private float generarNota() {
		return (float) (Math.random()*10);
	}
	public boolean estaAprobado() {
	    return nota >= 5;
	}

	@Override
	boolean calcNovillos() {
		return Math.random() < 0.5;
	}
	
	
}
