package classesAbstractes_AdrianSanchez;

/**
 * Classe que representa un estudiant, estenent la classe abstracta Person.
 * Conté informació addicional com el curs i l'edat.
 * 
 * @author Adrian
 * @version 1.0
 */
public class Student extends Person {
    private String course;
    private int age;

    /**
     * Constructor que inicialitza un estudiant amb nom, curs i edat.
     * 
     * @param name  El nom de l'estudiant.
     * @param course El curs en què està matriculat l'estudiant.
     * @param age   L'edat de l'estudiant.
     */
    public Student(String name, String course, int age) {
        super(name);
        this.course = course;
        this.age = age;
    }

    /**
     * Mostra una descripció de l'estudiant, incloent el nom, el curs i l'edat.
     */
    @Override
    public void getDescription() {
        System.out.println("Nombre: " + getName() + ", Curso: " + course + ", Edad: " + age);
    }
}
