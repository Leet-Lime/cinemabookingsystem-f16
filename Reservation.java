
/**
 * The Resevation class contains important details needed for a reservation. These details
 * include the seat number that the viewer may be assigned, the row number that the viewer's seat 
 * may be in, and the show that the viewer has a reservation for.
 * 
 * @author Christopher Reynolds 
 * @version 2016.11.28
 */
public class Reservation
{
    private Show show;
    private int rowNumber;
    private int seatNumber;
    
    /**
     * Constructor for objects of class Reservation.
     */
    public Reservation()
    {
        // initialize instance variables
    }
    
    /**
     * Get the show specified in the reservation
     * @return show
     */
    public Show getShow()
    {
        // get the show
        return null;
    }
    
    /**
     * Get the row number specified in the reservation
     * @return rowNumber
     */
    public int getRowNum()
    {
        // get the row number
        return 0;
    }
    
    /**
     * Get the seat number specified in the reservation
     * @return seatNumber
     */
    public int getSeatNum()
    {
        // get the seat number
        return 0;
    }
    
}
