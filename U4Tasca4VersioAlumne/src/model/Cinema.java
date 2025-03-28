package model;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Cinema implements ICinema{
	
	private ArrayList<ITheater> theaters;
	private ArrayList<IMovie> movies;
	private ArrayList<ISession> sessions;
	
	public Cinema() {
		this.theaters = new ArrayList<ITheater>();
		this.movies = new ArrayList<IMovie>();
		this.sessions = new ArrayList<ISession>();
	}

	@Override
	public ITheater[] getTheaters() {
		return theaters.toArray(new ITheater[0]);
	}

	@Override
	public void addTheater(int capacity) {
		theaters.add(new Theater(capacity));
	}

	@Override
	public void deleteTheater(int id) throws NoSuchElementException {
	    boolean found = false;
	    for (int i = 0; i < theaters.size(); i++) {
	        if (theaters.get(i).getId() == id) {
	            theaters.remove(i);
	            found = true;
	        }
	    }
	}

	@Override
	public void updateTheater(int id, int newCapacity) throws NoSuchElementException {
	    for (ITheater theater : theaters) {
	        if (theater.getId() == id) {
	            ((Theater) theater).setCapacity(newCapacity);
	        }
	    }
	}

	@Override
	public IMovie[] getMovies() {
		return movies.toArray(new IMovie[0]);
	}

	@Override
	public void addMovie(String name, String author, int duration) {
		movies.add(new Movie(name, author, duration));
	}

	@Override
	public void deleteMovie(int id) throws NoSuchElementException {
		boolean found = false;
		for (int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getId() == id) {
				movies.remove(i);
				found = true;
			}
		}
	}

	@Override
	public void updateMovie(int id, String newName, String newAuthor, int newDuration) throws NoSuchElementException {
	    for (IMovie movie : movies) {
	        if (movie.getId() == id) {
	            ((Movie) movie).setName(newName);
	            ((Movie) movie).setAuthor(newAuthor);
	            ((Movie) movie).setDuration(newDuration);
	        }
	    }
	}

	@Override
	public ISession[] getSessions() {
		return sessions.toArray(new ISession[0]);
	}

	@Override
	public void addSession(int idTheater, int idMovie, Date date) throws NoSuchElementException {
		 	ITheater theater = null;
		    IMovie movie = null;

		    for (ITheater t : theaters) {
		        if (t.getId() == idTheater) {
		            theater = t;
		        }
		    }

		    for (IMovie m : movies) {
		        if (m.getId() == idMovie) {
		            movie = m;
		        }
		    }

		sessions.add(new Session(theater, movie, date));
	}

	@Override
	public void deleteSession(int id) throws NoSuchElementException {
		boolean found = false;
	    for (int i = 0; i < sessions.size(); i++) {
	        if (sessions.get(i).getId() == id) {
	            sessions.remove(i);
	            found = true;
	        }
	    }
	}

	@Override
	public void updateSession(int id, Date newDate) throws NoSuchElementException {
		boolean found = false;
	    for (ISession session : sessions) {
	        if (session.getId() == id) {
	            session.setDate(newDate);
	            found = true;
	        }
	    }
	}

	@Override
	public void bookSeat(int idSession, int seatNumber) throws SeatAlreadyBookedException {
		ISession session = null;

	    for (ISession s : sessions) {
	        if (s.getId() == idSession) {
	            session = s;
	        }
	    }

	    if (session == null) {
	        System.out.println("Theres no session with that id " + idSession);
	        return;
	    }

	    ArrayList<ISeat> seats = ((Session) session).getSeats(); 

	    if (seatNumber < 0 || seatNumber >= seats.size()) {
	        System.out.println("Número de asiento inválido.");
	        return;
	    }

	    ISeat seat = seats.get(seatNumber);

	    if (((Seat) seat).isBooked()) {
	        System.out.println("The seat " + seatNumber + " is already occupied.");
	    } else {
	        ((Seat) seat).book();
	        System.out.println("The seat " + seatNumber + " has been reserved.");
	    }
	}

}
