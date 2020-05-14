package Ticket_Parking;

import java.util.Scanner;

public class Parking_Main {

	public static void main(String[] args) {
		
		Scanner input =new Scanner (System.in);
		System.out.print("Enter the make of car =");
		String make=input.nextLine();
		System.out.print("Enter the model of car =");
		String model=input.nextLine();
		System.out.print("Enter the color of car =");
		String color=input.nextLine();
		System.out.print("Enter the car LicenseNumber =");
		String licenseNumber=input.nextLine();
		System.out.print("Enter the Minuteparked =");
		double minuteparked=input.nextDouble();
		System.out.print("Enter minute purchased =");
		double purchased=input.nextDouble();
		System.out.print("Enter the police name =");
		input.nextLine();
		String name=input.nextLine();
		System.out.print("Enter the badge Number =");
		String badgeNumber=input.nextLine();
	
		
	    Parkedcar car = new Parkedcar(make,model,color,licenseNumber,minuteparked);
	    ParkingMeter meter = new ParkingMeter(purchased);
	    PoliceOfficer officer = new PoliceOfficer(name,badgeNumber);
		Parking_Ticket ticket = new Parking_Ticket();
		ticket.setCar(car);
		ticket.setMeter(meter);
		ticket.setOfficer(officer);
		ticket.calculation();
		System.out.println(ticket.toString());
		
		

	}

}
