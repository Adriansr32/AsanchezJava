package model;

public class Seat implements ISeat {
	private boolean booked;
	
	
	public Seat() {
		this.booked = false;
	}

	@Override
	public void book() throws SeatAlreadyBookedException {
			if (this.booked) {
				System.out.println("the seat is occupied");
			} else {
				this.booked = true;
			}
		
	}
	
	public boolean isBooked() {
		return booked;
	}

}
