package model;

/**
 * The IMovie interface defines the operations for managing a movie.
 * It provides methods to access and modify the movie's properties, such as its ID, name, author, and duration.
 */
public interface IMovie {

    /**
     * Retrieves the unique identifier of the movie.
     *
     * @return the ID of the movie.
     */
    int getId();

    /**
     * Sets the unique identifier of the movie.
     *
     * @param id the new ID to assign to the movie.
     */
    void setId(int id);

    /**
     * Retrieves the name of the movie.
     *
     * @return the name of the movie.
     */
    String getName();

    /**
     * Sets the name of the movie.
     *
     * @param name the new name to assign to the movie.
     */
    void setName(String name);

    /**
     * Retrieves the author or director of the movie.
     *
     * @return the author or director of the movie.
     */
    String getAuthor();

    /**
     * Sets the author or director of the movie.
     *
     * @param author the new author or director to assign to the movie.
     */
    void setAuthor(String author);

    /**
     * Retrieves the duration of the movie in minutes.
     *
     * @return the duration of the movie.
     */
    int getDuration();

    /**
     * Sets the duration of the movie in minutes.
     *
     * @param duration the new duration to assign to the movie.
     */
    void setDuration(int duration);
}
