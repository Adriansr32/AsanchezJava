package model;

import java.util.Date;
import java.util.NoSuchElementException;

/**
 * The ICinema interface defines the operations that can be performed on a cinema.
 * It includes methods for managing theaters, movies, sessions, and seat bookings.
 */
public interface ICinema {

    /**
     * Retrieves an array of all theaters in the cinema.
     *
     * @return an array of ITheater objects representing the theaters.
     */
    ITheater[] getTheaters();

    /**
     * Adds a new theater to the cinema with the specified capacity.
     *
     * @param capacity the capacity of the new theater.
     */
    void addTheater(int capacity);

    /**
     * Deletes a theater from the cinema by its ID.
     *
     * @param id the ID of the theater to delete.
     * @throws NoSuchElementException if no theater with the specified ID exists.
     */
    void deleteTheater(int id) throws NoSuchElementException;

    /**
     * Updates the capacity of an existing theater.
     *
     * @param id the ID of the theater to update.
     * @param newCapacity the new capacity of the theater.
     * @throws NoSuchElementException if no theater with the specified ID exists.
     */
    void updateTheater(int id, int newCapacity) throws NoSuchElementException;

    /**
     * Retrieves an array of all movies in the cinema.
     *
     * @return an array of IMovie objects representing the movies.
     */
    IMovie[] getMovies();

    /**
     * Adds a new movie to the cinema with the specified details.
     *
     * @param name the name of the movie.
     * @param author the author or director of the movie.
     * @param duration the duration of the movie in minutes.
     */
    void addMovie(String name, String author, int duration);

    /**
     * Deletes a movie from the cinema by its ID.
     *
     * @param id the ID of the movie to delete.
     * @throws NoSuchElementException if no movie with the specified ID exists.
     */
    void deleteMovie(int id) throws NoSuchElementException;

    /**
     * Updates the details of an existing movie.
     *
     * @param id the ID of the movie to update.
     * @param newName the new name of the movie.
     * @param newAuthor the new author or director of the movie.
     * @param newDuration the new duration of the movie in minutes.
     * @throws NoSuchElementException if no movie with the specified ID exists.
     */
    void updateMovie(int id, String newName, String newAuthor, int newDuration) throws NoSuchElementException;

    /**
     * Retrieves an array of all sessions in the cinema.
     *
     * @return an array of ISession objects representing the sessions.
     */
    ISession[] getSessions();

    /**
     * Adds a new session to the cinema with the specified details.
     *
     * @param idTheater the ID of the theater where the session will take place.
     * @param idMovie the ID of the movie to be shown in the session.
     * @param date the date and time of the session.
     * @throws NoSuchElementException if no theater or movie with the specified IDs exists.
     */
    void addSession(int idTheater, int idMovie, Date date) throws NoSuchElementException;

    /**
     * Deletes a session from the cinema by its ID.
     *
     * @param id the ID of the session to delete.
     * @throws NoSuchElementException if no session with the specified ID exists.
     */
    void deleteSession(int id) throws NoSuchElementException;

    /**
     * Updates the date of an existing session.
     *
     * @param id the ID of the session to update.
     * @param newDate the new date and time of the session.
     * @throws NoSuchElementException if no session with the specified ID exists.
     */
    void updateSession(int id, Date newDate) throws NoSuchElementException;

    /**
     * Books a seat for a specific session.
     *
     * @param idSession the ID of the session for which the seat is being booked.
     * @param seatNumber the number of the seat to book.
     * @throws SeatAlreadyBookedException if the seat is already booked.
     */
    void bookSeat(int idSession, int seatNumber) throws SeatAlreadyBookedException;
}
