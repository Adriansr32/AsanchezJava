package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

import model.Cinema;
import model.ICinema;
import model.ITheater;
import model.SeatAlreadyBookedException;
import model.IMovie;
import model.ISession;
import view.CLIView;
import view.IView;

/**
 * The Controller class manages the interaction between the user interface (view) and the cinema model.
 * It handles user input, processes commands, and updates the view accordingly.
 */
public class Controller {

    private ICinema cinema;
    private IView view;
    private Scanner scanner;

    /**
     * The main entry point for the application. Initializes the cinema, view, and controller,
     * and starts the main loop for handling user input.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        ICinema cinema = new Cinema();
        IView view = new CLIView();
        Controller controller = new Controller(view, cinema);
        controller.handleCinema();
    }

    /**
     * Constructs a new Controller with the specified view and cinema model.
     *
     * @param view the user interface view.
     * @param cinema the cinema model.
     */
    public Controller(IView view, ICinema cinema) {
        this.view = view;
        this.cinema = cinema;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Handles the main cinema menu, allowing the user to navigate between different sections
     * such as theaters, movies, sessions, and bookings.
     */
    public void handleCinema() {
        boolean exit = false;
        while (!exit) {
            view.displayCinemaMenu();
            int choice = getUserInput(0, 4);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    handleTheaters();
                    break;
                case 2:
                    handleMovies();
                    break;
                case 3:
                    handleSessions();
                    break;
                case 4:
                    handleBookings();
                    break;
            }
        }
    }

    /**
     * Handles the theater menu, allowing the user to view, add, delete, or update theaters.
     */
    private void handleTheaters() {
        boolean exit = false;
        while (!exit) {
            view.displayTheaterMenu();
            int choice = getUserInput(0, 4);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    showTheaters();
                    break;
                case 2:
                    view.queryTheaterCapacity();
                    int capacity = getUserInput();
                    cinema.addTheater(capacity);
                    showTheaters();
                    break;
                case 3:
                    view.queryTheaterId();
                    int id = getUserInput();
                    try {
                        cinema.deleteTheater(id);
                        showTheaters();
                    } catch (NoSuchElementException e) {
                        view.displayErrorMessage(e.getMessage());
                    }
                    break;
                case 4:
                    view.queryTheaterId();
                    int oldId = getUserInput();
                    view.queryTheaterCapacity();
                    int newCapacity = getUserInput();
                    cinema.updateTheater(oldId, newCapacity);
                    showTheaters();
                    break;
            }
        }
    }

    /**
     * Handles the movie menu, allowing the user to view, add, delete, or update movies.
     */
    private void handleMovies() {
        boolean exit = false;
        while (!exit) {
            view.displayMovieMenu();
            int choice = getUserInput(0, 4);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    view.queryMovieName();
                    String name = getUserInputString();
                    view.queryMovieAuthor();
                    String author = getUserInputString();
                    view.queryMovieDuration();
                    int duration = getUserInput();
                    cinema.addMovie(name, author, duration);
                    showMovies();
                    break;
                case 3:
                    view.queryMovieId();
                    int id = getUserInput();
                    try {
                        cinema.deleteMovie(id);
                        showMovies();
                    } catch (NoSuchElementException e) {
                        view.displayErrorMessage(e.getMessage());
                    }
                    break;
                case 4:
                    view.queryMovieId();
                    int oldId = getUserInput();
                    view.queryMovieName();
                    String newName = getUserInputString();
                    view.queryMovieAuthor();
                    String newAuthor = getUserInputString();
                    view.queryMovieDuration();
                    int newDuration = getUserInput();
                    cinema.updateMovie(oldId, newName, newAuthor, newDuration);
                    showMovies();
                    break;
            }
        }
    }

    /**
     * Handles the session menu, allowing the user to view, add, delete, or update sessions.
     */
    private void handleSessions() {
        boolean exit = false;
        while (!exit) {
            view.displaySessionMenu();
            int choice = getUserInput(0, 4);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    showSessions();
                    break;
                case 2:
                    view.queryTheaterId();
                    int theaterId = getUserInput();
                    view.queryMovieId();
                    int movieId = getUserInput();
                    view.querySessionDate();
                    Date date = getUserInputDate();
                    try {
                        cinema.addSession(theaterId, movieId, date);
                    } catch (NoSuchElementException e) {
                        view.displayErrorMessage(e.getMessage());
                    }
                    showSessions();
                    break;
                case 3:
                    view.querySessionId();
                    int id = getUserInput();
                    try {
                        cinema.deleteSession(id);
                        showSessions();
                    } catch (NoSuchElementException e) {
                        view.displayErrorMessage(e.getMessage());
                    }
                    break;
                case 4:
                    view.querySessionId();
                    int oldId = getUserInput();
                    view.querySessionDate();
                    Date newDate = getUserInputDate();
                    cinema.updateSession(oldId, newDate);
                    showSessions();
                    break;
            }
        }
    }

    /**
     * Handles the booking menu, allowing the user to book a seat for a specific session.
     */
    private void handleBookings() {
        boolean exit = false;
        while (!exit) {
            view.displayBookingMenu();
            int choice = getUserInput(0, 1);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    view.querySessionId();
                    int sessionId = getUserInput();
                    view.querySeatNumber();
                    int seatNumber = getUserInput();
                    try {
                        cinema.bookSeat(sessionId, seatNumber);
                    } catch (SeatAlreadyBookedException e) {
                        view.displayErrorMessage(e.getMessage());
                    }
                    showSessions();
                    break;
            }
        }
    }

    /**
     * Reads an integer input from the user.
     *
     * @return the integer input from the user.
     */
    private int getUserInput() {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                scanner.next();
            }
            view.displayErrorMessage("Invalid input. Please enter a valid number");
        }
        return choice;
    }

    /**
     * Reads a date input from the user in the format "YYYY-MM-DD".
     *
     * @return the date input from the user.
     */
    public Date getUserInputDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Enter date (YYYY-MM-DD): ");
                String input = scanner.nextLine();
                date = dateFormat.parse(input);
                isValid = true;
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
            }
        }

        return date;
    }

    /**
     * Reads a string input from the user.
     *
     * @return the string input from the user.
     */
    private String getUserInputString() {
        String input = scanner.nextLine();
        return input;
    }

    /**
     * Reads an integer input from the user within a specified range.
     *
     * @param min the minimum valid input value.
     * @param max the maximum valid input value.
     * @return the integer input from the user.
     */
    private int getUserInput(int min, int max) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    scanner.nextLine();
                    break;
                }
            } else {
                scanner.next();
            }
            view.displayErrorMessage("Invalid choice. Please enter a number between " + min + " and " + max);
        }
        return choice;
    }

    /**
     * Displays a list of all theaters in the cinema.
     */
    private void showTheaters() {
        ITheater[] theaters = cinema.getTheaters();
        view.displayTheaters(theaters);
    }

    /**
     * Displays a list of all movies in the cinema.
     */
    private void showMovies() {
        IMovie[] movies = cinema.getMovies();
        view.displayMovies(movies);
    }

    /**
     * Displays a list of all sessions in the cinema.
     */
    private void showSessions() {
        ISession[] sessions = cinema.getSessions();
        view.displaySessions(sessions);
    }
}
