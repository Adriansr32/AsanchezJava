package model;

import java.util.Date;
import java.util.ArrayList;

public class Session implements ISession {
	private static int counter = 0;
	private int id;
	private ITheater theater;
	private IMovie movie;
	private ArrayList<ISeat> seats;
	private Date date;
	
	
	public Session(ITheater theater, IMovie movie, Date date) {
	    this.id = counter++;
	    this.theater = theater;
	    this.movie = movie;
	    this.date = date;
	    this.seats = new ArrayList<ISeat>();

	    for (int i = 0; i < theater.getCapacity(); i++) {
	        this.seats.add(new Seat());
	    }
	}


	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date newDate) {
		this.date = newDate;
	}

	@Override
	public void book(int seatNumber) throws SeatAlreadyBookedException {
		seats.get(seatNumber).book();
	}

	public ArrayList<ISeat> getSeats() {
		return seats;
	}
	@Override
	public String toString() {
		return "idSession: " + id + "\nTheater" + theater + "\nMovie" + movie + "\nDate: " + date + "\n------------------";
	}
}
