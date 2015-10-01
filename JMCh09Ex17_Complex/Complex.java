/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author Kushal Tirumala
 * @version 9/29/2015
 * @author Period: 6
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: Kushal Tirumala
 */
public class Complex
{
    private double a, b;


    /**
     * construcor that takes one param
     * 
     * @param a
     *            value of a
     */
    public Complex( double a )
    {
        this.a = a;
        b = 0;
    }


    /**
     * Constructor for given two number
     * 
     * @param a
     *            a-value
     * @param b
     *            b-value
     */
    public Complex( double a, double b )
    {
        this.a = a;
        this.b = b;
    }


    /**
     * returns the value of a
     * 
     * @return value of a
     */
    public double getA()
    {
        return a;
    }


    /**
     * 
     * returns the value of b
     * 
     * @return value of b
     */
    public double getB()
    {
        return b;
    }


    /**
     * absolute value of the compelx number
     * 
     * @return the absolute value
     */
    public double abs()
    {
        return Math.sqrt( ( a * a ) + ( b * b ) );
    }


    /**
     * 
     * adding two complex numbers
     * 
     * @param num
     *            the complex number to add
     * @return the new added complex number
     */
    public Complex add( Complex num )
    {
        double a = num.getA() + this.a;
        double b = num.getB() + this.b;
        Complex ans = new Complex( a, b );
        return ans;
    }


    /**
     * 
     * Adding a complex number with a real number
     * 
     * @param num
     *            the real number to add to the complex number
     * @return the new complex number that is added
     */
    public Complex add( double num )
    {
        return new Complex( a + num, b );
    }


    public Complex multiply( double num )
    {
        return new Complex( a * num, b * num );
    }


    /**
     * Multiplies two complex numbers
     * 
     * @param num
     *            the complex number to multiple
     * @return the new multiplied complex number
     */
    public Complex multiply( Complex num )
    {
        double a = ( this.a * num.getA() ) + ( -1 * ( this.b * num.getB() ) );
        double b = ( this.b * num.getA() ) + ( this.a * num.getB() );
        Complex ans = new Complex( a, b );
        return ans;
    }


    /**
     * turns the Complex number into a string
     * 
     * @return the string version of the Complex number
     */
    public String toString()
    {
        return a + " + " + b + "i";
    }
}
