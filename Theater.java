import java.util.List;
import java.awt.Point;

/**The Theater class has to ask the Row and Seat class for avalible free seats and be able to mark a seat as
 * reserved. Stores a list of Rows and a string for Name.
 * 
 * @author Cory Fields 
 * @version 2016.11.28
 */
public class Theater
{
    private List<Row> rows;
    private String name;

    /**
     * Constructor for objects of class Theater. Takes no param.
     */
    public Theater()
    {
        
    }

    /**
     * Finds free seats based on a list of points.
     * 
     * @return     List of free seats 
     */
    public List<Point> FindFreeSeats()
    {
        return null;
    }
   
    /**
     * Reserves a seat based on its row and seat numbers
     * 
     * @param Row An int for row number
     * @param Seat An int for seat number
     */
    public void ReserveSeat(int Row, int Seat)
    {
        
    }
    
    /**
     * Method to find the max number of adjacent free seats. Takes no param.
     */
    public int FindMaxFreeSeats() 
    {
        return 0;
    }
    
    /**
     * Cancels a reservation based on row and seat number.
     * 
     * @param Row An int for row number
     * @param Seat An int for seat number
     */
    public void CancelReservation(int rowNumber, int seatNumber)
    {
        
    }
    
    /**
     * Method to find the max number of adjacent free seats. Takes no param.
     */
    public int findAdjacentSeats()
    {
        return 0;
    }
    
    /**
     * Makes a new row of seats.
     * 
     * @param rowNumber The row number for the new row created.
     */
    public void makeRow(int rowNumber)
    {
        
    }
}
