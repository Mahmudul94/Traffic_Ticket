package Ticket_Parking;

public class Parking_Ticket {
	private double fines;
	private double minutes;
	final double BASE_FINE=25.0;
	final double HOURLY_FINE=10.0;
	private Parkedcar car;
	private ParkingMeter meter;
	private PoliceOfficer officer;
	public Parking_Ticket() {
		super();
		
	}
	public Parkedcar getCar() {
		return car;
	}
	public void setCar(Parkedcar car) {
		this.car = car;
	}
	public ParkingMeter getMeter() {
		return meter;
	}
	public void setMeter(ParkingMeter meter) {
		this.meter = meter;
	}
	public PoliceOfficer getOfficer() {
		return officer;
	}
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}
	public double calculation() {
		if(meter.getMinutepurchased()<car.getMinuteparked()) {
			minutes=car.getMinuteparked()-meter.getMinutepurchased();
			if(minutes <=60) {
				fines=BASE_FINE;
			}else if(minutes >60 && minutes <120) {
				fines=BASE_FINE+HOURLY_FINE;
			}
		}
		return fines;
	}
	@Override
	public String toString() {
		return "car Information: " + car + 
				"\nmeter: \n" + meter+
				"\nofficer information: \n" + officer+
				"\nIllegal park  Time: "+(car.getMinuteparked()-meter.getMinutepurchased())+
				"\nFine is = "+fines ;
		     
				
				
	}
	
	
	
	

}
