package GOFO;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args)
	{
		try (Scanner scan = new Scanner(System.in)) {
			PlaygroundOwner PO = new PlaygroundOwner();
			PlayGround pg = new PlayGround();
			system system=new system();
			
			String Name= scan.nextLine();
			int ID= scan.nextInt(); 
			String Password= scan.nextLine();
			String Email= scan.nextLine(); 
			String Phone= scan.nextLine(); 
			String Location;
			Location = scan.nextLine();
			
			PO.Register(Name,ID,Password,Email,Phone ,Location);
			system.CreateRegistration(PO);
			
			PO.display();
			
		}
	}
	
}
