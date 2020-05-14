package Ticket_Parking;

public class PoliceOfficer {
	
	private String name;
	private String badgeNumber;
	public PoliceOfficer(String name, String badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	@Override
	public String toString() {
		return "PoliceOfficer name=" + name +
				"\nbadgeNumber=" + badgeNumber;
				
				
	}
	
	

}
