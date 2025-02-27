package classesAbstractes_AdrianSanchez;

/**
 * Classe principal que conté el mètode main per executar el programa.
 * Crea instàncies de les classes Employee i Student i crida els seus mètodes.
 * 
 * @author Adrian
 * @version 1.0
 */
public class Main {
    /**
     * Mètode principal que inicialitza objectes de les classes Employee i Student
     * i crida els seus mètodes per obtenir descripcions.
     *
     * @param args Arguments de la línia de comandes (no utilitzats)
     */
    public static void main(String[] args) {
        Employee Empleado1 = new Employee("Adrian", 18, 2400);
        Employee Empleado2 = new Employee("Adrian", 18);
        Student Estudiante1 = new Student("Adrian", "Dam", 18);
       
        Empleado1.getDescription();
        Empleado2.getDescription();
        Estudiante1.getDescription();
    }

}
