import java.awt.Point;
import java.util.List;
/**
 * The Customer class contains customer objects that reserve seats for shows. 
 * 
 * @author Marissa Tucker
 * @version 2016.11.28
 */
public class Customer
{
    // fields for the Customer class.
    String name;
    List<Reservation> reservations;
    String PhoneNumber;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables

    }

    /**
     * This method adds a reservation to a show
     * 
     * @param Show The show tha the customer wishes to reserve seats for.
     * @param row The row in which the reseveration is made.
     * @param seat The seat that is being reserved by the customer object.
     */
    void addReservation(Show show, int row, int seat)
    {
    }
    
    /**
     * This method finds customer reservations by a particular show.
     * 
     * @param Show The show that we are using to find customer reservations.
     */
    List<Point> findShowReservationbyShow(Show show)
    {
        return null;
    }
    
    /**
     * This method gets the phone number of the customer in the event that they will need to be contacted in the future.
     */
    String getPhoneNumber()
    {
        return null;
    }
}
