package view;

import model.ITheater;
import model.IMovie;
import model.ISession;

/**
 * The IView interface defines the methods required for displaying information to the user
 * and querying user input. It acts as the user interface for the cinema management system.
 */
public interface IView {

    /**
     * Displays an error message to the user.
     *
     * @param message the error message to display.
     */
    void displayErrorMessage(String message);

    /**
     * Displays the main cinema menu to the user.
     */
    void displayCinemaMenu();

    /**
     * Displays the theater management menu to the user.
     */
    void displayTheaterMenu();

    /**
     * Displays the session management menu to the user.
     */
    void displaySessionMenu();

    /**
     * Displays the movie management menu to the user.
     */
    void displayMovieMenu();

    /**
     * Displays the booking management menu to the user.
     */
    void displayBookingMenu();

    /**
     * Displays a list of theaters to the user.
     *
     * @param theaters an array of ITheater objects representing the theaters to display.
     */
    void displayTheaters(ITheater[] theaters);

    /**
     * Displays a list of movies to the user.
     *
     * @param movies an array of IMovie objects representing the movies to display.
     */
    void displayMovies(IMovie[] movies);

    /**
     * Displays a list of sessions to the user.
     *
     * @param sessions an array of ISession objects representing the sessions to display.
     */
    void displaySessions(ISession[] sessions);

    /**
     * Prompts the user to enter a theater ID.
     */
    void queryTheaterId();

    /**
     * Prompts the user to enter a theater capacity.
     */
    void queryTheaterCapacity();

    /**
     * Prompts the user to enter a movie name.
     */
    void queryMovieName();

    /**
     * Prompts the user to enter a movie author or director.
     */
    void queryMovieAuthor();

    /**
     * Prompts the user to enter a movie duration.
     */
    void queryMovieDuration();

    /**
     * Prompts the user to enter a movie ID.
     */
    void queryMovieId();

    /**
     * Prompts the user to enter a session date.
     */
    void querySessionDate();

    /**
     * Prompts the user to enter a session ID.
     */
    void querySessionId();

    /**
     * Prompts the user to enter a seat number.
     */
    void querySeatNumber();
}
