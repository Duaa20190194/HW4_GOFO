package GOFO;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			PlaygroundOwner PO = new PlaygroundOwner();
			PlayGround pg = new PlayGround();
			system system = new system();
			Player player = new Player();
           		Booking book = new Booking();
					
			System.out.println("Enter your name");
			String Name = scan.nextLine();
			System.out.println("Enter your ID");
			int ID = scan.nextInt(); 
			scan.nextLine();
			System.out.println("Enter your password");
			String Password= scan.nextLine();
			System.out.println("Enter your email");
			String Email= scan.nextLine();
			System.out.println("Enter your phone");
			String Phone= scan.nextLine();
			System.out.println("Enter your location");
			String Location = scan.nextLine();
			
			PO.Register(Name,ID,Password,Email,Phone ,Location);
			system.CreateRegistration(PO);
			
			PO.display();
			System.out.println("Enter playgrounds name");
			String name=scan.nextLine();
			System.out.println("Enter playgrounds location");
			String location=scan.nextLine();
			System.out.println("Enter playgrounds size");
			float size=scan.nextFloat();
			System.out.println("Enter playgrounds available hours");
			int availableHours=scan.nextInt();
			System.out.println("Enter the price per hour");
			float pricePerHour=scan.nextFloat();
			scan.nextLine();
			System.out.println("Enter the cancellation period");
			String cancellationPeriod=scan.nextLine();
			
			pg.AddPlaygroundInfo(name, location, size, availableHours, pricePerHour, cancellationPeriod);
			pg.display();
			
			
			System.out.println("enter your time slot");
			int timeSlot = scan.nextInt();
            		System.out.println("enter booking number");
			int numofBooking = scan.nextInt();
			book.selectPlayground(pg);
          		book.displayPlaygroundInfo();
        		book.BookTimeSlot(timeSlot, numofBooking );
         		book.display();
            
            		player.BookingPlayground(book); 
		}
	}
	
}
