package exercicio;

abstract class Persona {
	private String nombre;
	protected int edad;
	private char sexo;
	
	public Persona(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

    public char getSexo() {
        return sexo;
    }
	abstract int generarEdad();
	abstract boolean calcNovillos();
}
