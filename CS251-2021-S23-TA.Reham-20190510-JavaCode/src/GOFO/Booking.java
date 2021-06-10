
package GOFO;


public class Booking {
    
    private int numofBooking;
    private int timeSlot;
    private Playground name;
    
    
    /**
     * This is a function that select playground name
     * @param name 
     */
        public void selectPlayground(Playground name){
        this.name = name;   
        }
        
        public void displayPlaygroundInfo(){
        name.display();
        }
        

   /**
    * This a function that book a time slot
    * @param timeslot
    * @param num 
    */ 
    public void BookTimeSlot(int timeslot, int num){
    this.timeSlot = timeslot;
    this.numofBooking = num;
    }
    /**
     * This is a function that display the information
     */
    public void display(){
        System.out.println("your Booking number is " + numofBooking + "  your time slot :" + timeSlot +
        "Playgroun name is " + name); 
    
    }
    
}

