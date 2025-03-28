package classesAbstractes_AdrianSanchez;

/**
 * Classe abstracta que representa una persona amb un nom.
 * Les subclasses han d'implementar el mètode abstracte getDescription().
 * 
 * @author Adrian
 * @version 1.0
 */
abstract class Person {
    private String name;
    

    /**
     * Constructor que inicialitza el nom de la persona.
     * 
     * @param name El nom de la persona.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Retorna el nom de la persona.
     * 
     * @return El nom de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Mètode abstracte que proporciona una descripció de la persona.
     * Ha de ser implementat per les subclasses.
     */
    public abstract void getDescription();
}
