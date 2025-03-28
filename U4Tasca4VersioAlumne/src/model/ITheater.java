package model;

/**
 * The ITheater interface defines the operations for managing a theater.
 * It provides methods to access and modify the theater's properties, such as its ID and capacity.
 */
public interface ITheater {

    /**
     * Sets the unique identifier of the theater.
     *
     * @param id the new ID to assign to the theater.
     */
    void setId(int id);

    /**
     * Retrieves the unique identifier of the theater.
     *
     * @return the ID of the theater.
     */
    int getId();

    /**
     * Sets the capacity of the theater, which represents the maximum number of seats available.
     *
     * @param capacity the new capacity to assign to the theater.
     */
    void setCapacity(int capacity);

    /**
     * Retrieves the capacity of the theater, which represents the maximum number of seats available.
     *
     * @return the capacity of the theater.
     */
    int getCapacity();
}
