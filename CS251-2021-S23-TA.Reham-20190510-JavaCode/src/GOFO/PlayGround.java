package GOFO;

import java.util.Date;

public class PlayGround {
	private String name;
	private String location;
	private float size;
	private int availableHours;
	private float pricePerHour;
	private String cancellationPeriod;
	
	
	
public void AddPlaygroundInfo(String name,String location , float size, int availableHours, float pricePerHour, String cancellationPeriod) {
		this.name=name;
		this.location=location;
		this.size=size;
		this.availableHours =availableHours;
		this.pricePerHour=pricePerHour;
		this.cancellationPeriod=cancellationPeriod;
	}
public void display() {
System.out.println("your playgrounds information is: name: "+ name+ " location: "+location+" size: "+size+" available hours: "+availableHours+" price per hour: "+pricePerHour+" cancelation period: "+cancellationPeriod);

}

}
