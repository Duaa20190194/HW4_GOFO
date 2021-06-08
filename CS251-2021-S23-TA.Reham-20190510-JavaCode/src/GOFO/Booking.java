
package GOFO;


public class Booking {
    
    private int numofBooking;
    private int timeSlot;
    
    public void BookTimeSlot(int timeslot, int num){
    this.timeSlot = timeslot;
    this.numofBooking = num;
    }
    
    public void display(){
        System.out.println("your Booking number is " + numofBooking + "  your time slot :" + timeSlot);
    
    }
    
}

