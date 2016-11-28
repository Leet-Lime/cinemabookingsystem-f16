import java.util.List;
/**
 * This class finds customers that have made a reservation for
 * a specific show. It will return a list of customers names and 
 * phone numbers when called upon
 * 
 * 
 * @author Caylin Doran  
 * @version 2016.11.28
 */
public class Customers
{
    // instance variables - replace the example below with your own
    private List<Customer> customers;

    /**
     * Constructor for objects of class Customers
     */
    public Customers()
    {
        // initialise instance variables
        
    }
    
    /**
     * A list of customers that are attending
     * a specific show
     * 
     * @param the name of the show the customer is attending
     * @return the list of customers attending the show
     */
    List<Customer> findCustomersByShow(Show show)
    {
       return null; 
    }
    
    /**
     * A list of the customers phone numbers that 
     * are attending a specific show
     * 
     * @return the list of phone numbers
     */
    List<String> getPhoneNumbers()
    {
        return null;
    }


}
