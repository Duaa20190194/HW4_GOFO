
package GOFO;


public class Player {
    
    private String Name;
	private int ID;
	private String Email;
	private String Phone;
	private String Location;
	private String Password;
        private Booking book;
        
        public void Register(String Name, int ID, String Password, String Email, String Phone , String Location) {
		this.Name=Name;
		this.ID=ID;
		this.Password=Password;
		this.Email=Email;
		this.Phone=Phone;
		this.Location=Location;}
        
        public void BookingPlayground(Booking book){
            this.book = book;
        }
    
}
