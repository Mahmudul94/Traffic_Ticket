package Ticket_Parking;

public class ParkingMeter {
	private double minutepurchased;

	public ParkingMeter(double minutepurchased) {
		super();
		this.minutepurchased = minutepurchased;
	}

	public double getMinutepurchased() {
		return minutepurchased;
	}

	public void setMinutepurchased(int minutepurchased) {
		this.minutepurchased = minutepurchased;
	}

	@Override
	public String toString() {
		return "minutepurchased =" + minutepurchased ;
	}
	
	

}
