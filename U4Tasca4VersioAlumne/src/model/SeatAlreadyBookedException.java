package model;

/**
 * The SeatAlreadyBookedException is a custom exception that is thrown when an attempt is made
 * to book a seat that is already booked.
 */
public class SeatAlreadyBookedException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SeatAlreadyBookedException with the specified detail message.
     *
     * @param message the detail message that describes the reason for the exception.
     */
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}