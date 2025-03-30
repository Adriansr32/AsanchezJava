package exercises.education.persons;

import exercises.education.Assignement;

public class Teachers extends Persons implements Assignement{
	private String materia;
	
	
	public Teachers(String nombre,char sexo) {
		super(nombre, sexo);
		this.materia = Assignement.Materias[getMateriaRandom()];
		generarEdad();
	}
	
	@Override
	public String getMateria() {
		return materia;
	}
	
	@Override
	public int getMateriaRandom() {
		return (int) (Math.random()*3);
	}

	@Override
	public boolean calcNovillos() {
		return Math.random() < 0.2;
	}

	@Override
	int generarEdad() {
	    return super.edad = (int) (Math.random() * 31) + 30; 
	}
	

}
