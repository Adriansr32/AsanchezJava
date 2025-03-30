package exercises.education.test;
import exercises.education.classroom.*;
import exercises.education.persons.*;

public class Main {
    public static void main(String[] args) {
        
    	Stundents[] clase1 = {
            new Stundents("Fatima", 'F'),
            new Stundents("Kadijha", 'F'),
            new Stundents("Ismael", 'M'),
            new Stundents("Abdelouahid", 'M'),
            new Stundents("Bilal", 'M')
        };

        Teachers profesor = new Teachers("Jaume", 'M');
        Classroom aula = new Classroom("A1", clase1.length, profesor, clase1);

        if (aula.puedeDarseClase()) {
            aula.mostrarAprobados();
        }
        
        
    }
}
