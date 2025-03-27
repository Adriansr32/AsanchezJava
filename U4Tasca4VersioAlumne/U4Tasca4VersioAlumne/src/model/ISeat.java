package model;

/**
 * The ISeat interface defines the operations for managing a seat.
 * It provides a method to book a seat, which can throw an exception if the seat is already booked.
 */
public interface ISeat {

    /**
     * Books the seat. If the seat is already booked, an exception is thrown.
     *
     * @throws SeatAlreadyBookedException if the seat is already booked and cannot be booked again.
     */
    void book() throws SeatAlreadyBookedException;
}
