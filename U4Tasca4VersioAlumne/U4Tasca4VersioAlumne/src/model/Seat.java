package model;

public class Seat implements ISeat {
	private boolean booked;
	
	
	public Seat(boolean booked) {
		this.booked = booked;
	}

	@Override
	public void book() throws SeatAlreadyBookedException {
			if (this.booked) {
				throw new SeatAlreadyBookedException("El seient ja esta ocupat");
			} else {
				this.booked = true;
			}
		
	}

	public boolean isBooked() {
		return booked;
	}

}
