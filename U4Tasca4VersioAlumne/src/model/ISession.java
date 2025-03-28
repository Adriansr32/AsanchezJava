package model;

import java.util.Date;

/**
 * The ISession interface defines the operations for managing a session.
 * It provides methods to access and modify the session's properties, such as its ID and date,
 * as well as a method to book a seat for the session.
 */
public interface ISession {

    /**
     * Retrieves the unique identifier of the session.
     *
     * @return the ID of the session.
     */
    int getId();

    /**
     * Sets the unique identifier of the session.
     *
     * @param id the new ID to assign to the session.
     */
    void setId(int id);

    /**
     * Retrieves the date and time of the session.
     *
     * @return the date and time of the session.
     */
    Date getDate();

    /**
     * Sets the date and time of the session.
     *
     * @param newDate the new date and time to assign to the session.
     */
    void setDate(Date newDate);

    /**
     * Books a seat for the session.
     *
     * @param seatNumber the number of the seat to book.
     * @throws SeatAlreadyBookedException if the seat is already booked and cannot be booked again.
     */
    void book(int seatNumber) throws SeatAlreadyBookedException;
}
