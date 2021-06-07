package GOFO;

public class PlaygroundOwner {
  private String Name;
	private int ID;
	private String Email;
	private String Phone;
	private String Location;
	private String Password;
	
	/**
	 * This is a function that registers the information of a playground owner
	 * @param Name
	 * @param ID
	 * @param Password
	 * @param Email
	 * @param Phone
	 * @param Location
	 */
	public void Register(String Name, int ID, String Password, String Email, String Phone , String Location) {
		this.Name=Name;
		this.ID=ID;
		this.Password=Password;
		this.Email=Email;
		this.Phone=Phone;
		this.Location=Location;
		}
	/**
	 * This is a function that displays the information stored of a playground owner
	 */
	public void display() {
		System.out.println("your informations is: name: " + Name + " ID: " + ID + " email: "+Email + " phone: " + Phone + " location: " + Location);
	}
}
