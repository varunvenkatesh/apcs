import java.lang.reflect.*;


/**
 * This class implements a vendor that sells one kind of item. A vendor carries
 * out sales transactions.
 * 
 * @author Kushal Tirumala
 * @version 9/28/2015
 * 
 * @author Period - 6
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Kushal Tirumala
 */
public class Vendor
{
    // Fields:
    private int change, deposit, stock, priceItem;

    private static double totalSales = 0;


    // Constructor
    // Parameters:
    // int price of a single item in cents
    // int number of items to place in stock
    public Vendor( int priceItem, int stock )
    {
        this.priceItem = priceItem;
        this.stock = stock;
        deposit = 0;
        change = 0;

    }


    // Sets the quantity of items in stock.
    // Parameters:
    // int number of items to place in stock
    // Return:
    // None
    public void setStock( int numItems )
    {
        stock = numItems;
    }


    // Returns the number of items currently in stock.
    // Parameters:
    // None
    // Return:
    // int number of items currently in stock
    public int getStock()
    {
        return stock;
    }


    // Adds a specified amount (in cents) to the deposited amount.
    // Parameters:
    // int number of cents to add to the deposit
    // Return:
    // None
    public void addMoney( int numCents )
    {
        if ( stock != 0 )
            deposit += numCents;
    }


    // Returns the currently deposited amount (in cents).
    // Parameters:
    // None
    // Return:
    // int number of cents in the current deposit
    public int getDeposit()
    {
        return deposit;
    }


    // Implements a sale. If there are items in stock and
    // the deposited amount is greater than or equal to
    // the single item price, then adjusts the stock
    // and calculates and sets change and returns true;
    // otherwise refunds the whole deposit (moves it into change)
    // and returns false.
    // Parameters:
    // None
    // Return:
    // boolean successful sale (true) or failure (false)
    public boolean makeSale()
    {
        if ( stock > 0 && deposit >= priceItem )
        {
            stock--;
            change = deposit - priceItem;
            deposit = 0;
            totalSales += priceItem;
            return true;
        }
        else
        {
            change += deposit;
            deposit = 0;
            return false;
        }
    }


    // Returns and zeroes out the amount of change (from the last
    // sale or refund).
    // Parameters:
    // None
    // Return:
    // int number of cents in the current change
    public int getChange()
    {
        int temp = change;
        change = 0;
        return temp;
    }


    public static double getTotalSales()
    {
        double temp = totalSales;
        totalSales = 0;
        return temp * 0.01;
    }


    /**
     * Intended only for debugging.
     * 
     * <p>
     * A generic toString implementation that uses reflection to print names and
     * values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     * </p>
     * 
     * @return a string representation of this Vendor.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }
}
