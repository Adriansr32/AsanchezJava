package abstractEx.people;
 
/**
 * Abstract class that represents a person with a name.
 * Subclasses must implement the abstract method getDescription().
 */
public abstract class Person {
    private String name;

    /**
     * Constructor for Person class.
     * @param name The name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Gets the person's name.
     * @return The name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     * @param name The new name for the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the person's description.
     * Must be implemented by subclasses.
     * @return A string describing the person
     */
    public abstract String getDescription();
}