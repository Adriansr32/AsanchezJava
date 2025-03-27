package model;

import java.util.Date;
import java.util.ArrayList;

public class Session implements ISession {
	private static int counter = 0;
	private int id;
	private ITheater theater;
	private IMovie movie;
	private ArrayList<ISeat> seats;
	private Date data;
	
	
	public Session(ITheater theater, IMovie movie, Date data) {
		this.id = counter++;
		this.seats = new ArrayList<ISeat>();
		this.theater = theater;
		this.movie = movie;
		this.data = data;
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
		return data;
	}

	@Override
	public void setDate(Date newDate) {
		this.data = newDate;
	}

	@Override
	public void book(int seatNumber) throws SeatAlreadyBookedException {
		seats.get(seatNumber).book();
	}

	public ArrayList<ISeat> getSeats() {
		return seats;
	}

}
