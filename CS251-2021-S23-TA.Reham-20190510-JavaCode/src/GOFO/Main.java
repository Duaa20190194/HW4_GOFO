package GOFO;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			PlaygroundOwner PO = new PlaygroundOwner();
			PlayGround pg = new PlayGround();
			system system=new system();
			
			System.out.println("enter your name");
			String Name= scan.nextLine();
			System.out.println("enter your ID");
			int ID= scan.nextInt(); 
			System.out.println("enter your password");
			String Password= scan.nextLine();
			System.out.println("enter your email");
			String Email= scan.nextLine();
			System.out.println("enter your phone");
			String Phone= scan.nextLine();
			System.out.println("enter your location");
			String Location = scan.nextLine();
			
			PO.Register(Name,ID,Password,Email,Phone ,Location);
			system.CreateRegistration(PO);
			
			PO.display();
			System.out.println("enter playgrounds name");
			String name=scan.nextLine();
			System.out.println("enter playgrounds location");
			String location=scan.nextLine();
			System.out.println("enter playgrounds size");
			float size=scan.nextFloat();
			System.out.println("enter playgrounds available hours");
			int availableHours=scan.nextInt();
			System.out.println("enter the price per hour");
			float pricePerHour=scan.nextFloat();
			System.out.println("enter the cancellation period");
			String cancellationPeriod=scan.nextLine();
			
			pg.AddPlaygroundInfo(name, location, size, availableHours, pricePerHour, cancellationPeriod);
		}
	}
	
}
