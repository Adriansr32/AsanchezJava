package exercises.education.persons;

abstract class Persons {
	private String nombre;
	protected int edad;
	private char sexo;
	
	public Persons(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

    public char getSexo() {
        return sexo;
    }
	abstract int generarEdad();
	abstract boolean calcNovillos();
}
