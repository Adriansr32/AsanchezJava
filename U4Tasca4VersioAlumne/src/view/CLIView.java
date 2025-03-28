package view;

import model.ITheater;
import model.IMovie;
import model.ISession;

/**
 * The CLIView class implements the IView interface and provides a command-line interface
 * for interacting with the cinema management system. It displays menus, prompts for user input,
 * and shows information such as theaters, movies, and sessions.
 */
public class CLIView implements IView {

    private static final String CINEMA_MENU_NAME = "CINEMA";
    private static final String[] CINEMA_MENU_OPTIONS = { "0. Exit", "1. Theater menu", "2. Movie menu",
            "3. Session menu", "4. Booking menu" };
    private static final String THEATER_MENU_NAME = "THEATER";
    private static final String[] THEATER_MENU_OPTIONS = { "0. Return to cinema menu",
            "1. List theaters", "2. Add theater", "3. Delete theater", "4. Update theater" };
    private static final String MOVIE_MENU_NAME = "MOVIE";
    private static final String[] MOVIE_MENU_OPTIONS = { "0. Return to cinema menu", "1. List movies",
            "2. Add movie", "3. Delete movie", "4. Update movie" };
    private static final String SESSION_MENU_NAME = "SESSION";
    private static final String[] SESSION_MENU_OPTIONS = { "0. Return to cinema menu",
            "1. List sessions", "2. Add session", "3. Delete session", "4. Update sessions" };
    private static final String BOOKING_MENU_NAME = "BOOKING";
    private static final String[] BOOKING_MENU_OPTIONS = { "0. Return to cinema menu",
            "1. Book seats" };

    /**
     * Displays a menu with a given name and list of options.
     *
     * @param name the name of the menu.
     * @param options the list of options to display in the menu.
     */
    public void displayMenu(String name, String[] options) {
        System.out.println("--- " + name + " MENU ---");
        System.out.println("Options:");
        for (String option : options) {
            System.out.println("\t" + option);
        }
        System.out.println("Choice:");
    }

    @Override
    public void displayErrorMessage(String message) {
        System.out.println("Error:" + message);
    }

    @Override
    public void displayCinemaMenu() {
        displayMenu(CINEMA_MENU_NAME, CINEMA_MENU_OPTIONS);
    }

    @Override
    public void displayTheaterMenu() {
        displayMenu(THEATER_MENU_NAME, THEATER_MENU_OPTIONS);
    }

    @Override
    public void displaySessionMenu() {
        displayMenu(SESSION_MENU_NAME, SESSION_MENU_OPTIONS);
    }

    @Override
    public void displayMovieMenu() {
        displayMenu(MOVIE_MENU_NAME, MOVIE_MENU_OPTIONS);
    }

    @Override
    public void displayBookingMenu() {
        displayMenu(BOOKING_MENU_NAME, BOOKING_MENU_OPTIONS);
    }

    /**
     * Displays a list of theaters to the user.
     *
     * @param theaters an array of ITheater objects representing the theaters to display.
     */
    public void displayTheaters(ITheater[] theaters) {
        System.out.println("--- ---");
        System.out.println("Theaters:");
        for (ITheater theater : theaters) {
            System.out.println(theater);
        }
        System.out.println("--- ---");
    }

    /**
     * Displays a list of movies to the user.
     *
     * @param movies an array of IMovie objects representing the movies to display.
     */
    public void displayMovies(IMovie[] movies) {
        System.out.println("--- ---");
        System.out.println("Movies:");
        for (IMovie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("--- ---");
    }

    /**
     * Displays a list of sessions to the user.
     *
     * @param sessions an array of ISession objects representing the sessions to display.
     */
    public void displaySessions(ISession[] sessions) {
        System.out.println("--- ---");
        System.out.println("Sessions:");
        for (ISession session : sessions) {
            System.out.println(session);
        }
        System.out.println("--- ---");
    }

    @Override
    public void queryTheaterId() {
        System.out.println("Please enter the id of the Theater:");
    }

    @Override
    public void queryTheaterCapacity() {
        System.out.println("Please enter the capacity of the Theater:");
    }

    @Override
    public void queryMovieName() {
        System.out.println("Please enter the name of the Movie:");
    }

    @Override
    public void queryMovieAuthor() {
        System.out.println("Please enter the author of the Movie:");
    }

    @Override
    public void queryMovieDuration() {
        System.out.println("Please enter the duration of the Movie:");
    }

    @Override
    public void queryMovieId() {
        System.out.println("Please enter the movie id:");
    }

    @Override
    public void querySessionDate() {
        System.out.println("Please enter the date of the Session(YYYY-MM-DD):");
    }

    @Override
    public void querySessionId() {
        System.out.println("Please enter the id of the Session:");
    }

    @Override
    public void querySeatNumber() {
        System.out.println("Please enter the seat position:");
    }
}
