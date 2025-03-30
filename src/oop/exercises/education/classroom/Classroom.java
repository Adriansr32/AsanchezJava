package exercises.education.classroom;

import exercises.education.Assignement;
import exercises.education.persons.*;
public  class Classroom implements Assignement {
	private String id;
	private int maxAlumn;
	private String materia;
	private Stundents[] estudiantes;
	private Teachers profesor;

	
    public Classroom(String id, int maxAlumn, Teachers profesor, Stundents[] estudiantes) {
        this.id = id;
        this.maxAlumn = maxAlumn;
        this.materia = Assignement.Materias[getMateriaRandom()];
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }
    public boolean puedeDarseClase() {
        if (profesor.calcNovillos()) {
            System.out.println("El profesor no está disponible.");
            return false;
        }

        if (!profesor.getMateria().equals(this.materia)) {
            System.out.println("El profesor no puede dar esta materia.");
            return false;
        }

        int asistentes = 0;
        for (Stundents estudiante : estudiantes) {
            if (!estudiante.calcNovillos()) {
                asistentes++;
            }
        }

        if (asistentes <= maxAlumn / 2) {
            System.out.println("No hay suficientes estudiantes presentes.");
            return false;
        }

        System.out.println("La clase puede darse.");
        return true;
    }
    
    public void mostrarAprobados() {
        int aprobadosM = 0, aprobadosF = 0;

        for (Stundents estudiante : estudiantes) {
            if (estudiante.estaAprobado()) {
                if (estudiante.getSexo() == 'M') {
                    aprobadosM++;
                } else {
                    aprobadosF++;
                }
            }
        }

        System.out.println("Alumnos aprobados: " + aprobadosM);
        System.out.println("Alumnas aprobadas: " + aprobadosF);
    }	
    
    @Override
	public int getMateriaRandom() {
		return (int) (Math.random()*3);
	}

	@Override
	public String getMateria() {
		return materia;
	}

}
