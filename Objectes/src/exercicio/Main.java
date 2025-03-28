package exercicio;

public class Main {
    public static void main(String[] args) {
        
    	Estudiante[] clase1 = {
            new Estudiante("Fatima", 'F'),
            new Estudiante("Kadijha", 'F'),
            new Estudiante("Ismael", 'M'),
            new Estudiante("Abdelouahid", 'M'),
            new Estudiante("Bilal", 'M')
        };

        Profesor profesor = new Profesor("Jaume", 'M');
        Aula aula = new Aula("A1", clase1.length, profesor, clase1);

        if (aula.puedeDarseClase()) {
            aula.mostrarAprobados();
        }
        
        
    }
}
