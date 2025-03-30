package abstractEx.people;


/**
 * Class that represents a student, extending the abstract Person class.
 */
public class Student extends Person {
    private String major;

    /**
     * Constructor for Student class.
     * @param name The name of the student
     * @param major The major of the student
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    /**
     * Gets the student's description.
     * @return A string containing the student's name and major
     */
    @Override
    public String getDescription() {
        return String.format("A student with name %s studying %s", getName(), major);
    }

    /**
     * Gets the student's major.
     * @return The major of the student
     */
    public String getMajor() {
        return major;
    }

    /**
     * Sets the student's major.
     * @param major The new major for the student
     */
    public void setMajor(String major) {
        this.major = major;
    }
}