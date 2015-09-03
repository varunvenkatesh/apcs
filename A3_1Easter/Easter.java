import java.lang.reflect.*;
import java.util.Scanner;


/**
 * Calculates the time of Easter for a given year
 *
 * @author ktirumala940
 * @version Sep 2, 2015
 * @author Period: 6
 * @author Assignment: A3_1Easter
 *
 * @author Sources: Kushal Tirumala
 */
public class Easter
{
    private int y;

    private int a;

    private int b;

    private int c;

    private int d;

    private int e;

    private int f;

    private int g;

    private int h;

    private int i;

    private int k;

    private int r;

    private int m;

    private int n;

    private int p;


    /**
     * Constructor for the Easter object class
     * 
     * @param year
     *            year calculating the time of Easter for
     */
    public Easter( int year )
    {
        y = year;
    }


    /**
     * Does the actual calculation of the time of year Easter is
     */
    public void calculate()
    {
        a = y % 19;
        System.out.println( "a = " + a );
        b = y / 100;
        System.out.println( "b = " + b );
        c = y % 100;
        System.out.println( "c = " + c );
        d = b / 4;
        System.out.println( "d = " + d );
        e = b % 4;
        System.out.println( "e = " + e );
        f = ( b + 8 ) / 25;
        System.out.println( "f = " + f );
        g = ( b - f + 1 ) / 3;
        System.out.println( "g = " + g );
        h = ( 19 * a + b - d - g + 15 ) % 30;
        System.out.println( "h = " + h );
        i = c / 4;
        System.out.println( "i = " + i );
        k = c % 4;
        System.out.println( "k = " + k );
        r = ( 32 + 2 * e + 2 * i - h - k ) % 7;
        System.out.println( "r = " + r );
        m = ( a + 11 * h + 22 * r ) / 451;
        System.out.println( "m = " + m );
        n = ( h + r - 7 * m + 114 ) / 31;
        System.out.println( "n = " + n );
        p = ( h + r - 7 * m + 114 ) % 31;
        System.out.println( "p = " + p );
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
     * @return a string representation of this Easter.
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
                str += separator + field.getType().getName() + " " + 
                                field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }
            separator = ", ";
        }
        return str + "]";
    }


    /**
     * Main method for testing the program
     * 
     * @param args
     *            command line arguments
     */
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );

        System.out.print( "Please enter the year (yyyy) --> " );
        int year = console.nextInt();

        Easter bunny = new Easter( year );
        bunny.calculate();
    }
}
