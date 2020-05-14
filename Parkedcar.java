package Ticket_Parking;

public class Parkedcar {
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private double minuteparked;
	
	public Parkedcar(String make, String model, String color, String licenseNumber, double minuteparked) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minuteparked = minuteparked;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public double getMinuteparked() {
		return minuteparked;
	}
	public void setMinuteparked(double minuteparked) {
		this.minuteparked = minuteparked;
	}
	@Override
	public String toString() {
		return "\nmake=" + make + 
				"\nmodel=" + model + 
				"\ncolor=" + color + 
				"\nlicenseNumber=" + licenseNumber
				+"\nminuteparked=" + minuteparked;
	}
	
	

}
