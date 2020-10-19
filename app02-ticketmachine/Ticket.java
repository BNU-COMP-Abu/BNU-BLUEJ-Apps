import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (Abu Ahmed)
 * @version (0.1)
 */
public class Ticket
{
    
    
    //Journey Destination  
    private String destination;
    
    //This is the ticket price in pence 
    private int price;
    
    // The date and time the ticket was issued 
    private Date timeStamp;
    
    /**
     * Constructor for objects of class Ticket
     * 
     */
    public Ticket(String destination, int price)
    {
        timeStamp = new Date();
        this.destination = destination;
        this.price = price;
    } 
    
    /**
     * Return the ticket's destination as a string
     * NOT NEEDED 
     */
    public String getDestination()
    
    {
       return destination;
    }
    
    /**
     * 
     */
    public void print()
    {
       System.out.println("Ticket to "+ destination);
       System.out.println("Cost " + price + "p");
       System.out.println("Issued" + timeStamp);
    }
    
    
}  
