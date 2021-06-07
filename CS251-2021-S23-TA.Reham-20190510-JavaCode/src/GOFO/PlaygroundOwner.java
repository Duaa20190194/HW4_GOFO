package GOFO;

public class PlaygroundOwner {
  private String Name;
	private int ID;
	private String Email;
	private String Phone;
	private String Location;
	private String Password;
	
	public void Register(String Name, int ID, String Password, String Email, String Phone , String Location) {
		this.Name=Name;
		this.ID=ID;
		this.Password=Password;
		this.Email=Email;
		this.Phone=Phone;
		this.Location=Location;
		}
	
}
