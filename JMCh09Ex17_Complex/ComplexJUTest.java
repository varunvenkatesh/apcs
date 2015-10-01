import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;


/**
 * Test for the complex number class.
 * 
 * testConstructor1Param - test the 1 parameter constructor
 * testConstructor2Param - test the 2 parameter constructor
 * testAddRealAndComplexNum - addition of a complex number with a real number
 * testAdd2ComplexNums - addition of two complex numbers
 * testMultiply2ComplexNums - multiplication of two complex numbers
 * testMultiplyRealAndComplexNum - multiplication of a complex number with a
 * real number testAbsoluteValue - absolute value of a complex number
 *
 * @author Kushal Tirumala
 * @version 9/29/2015
 * @author Period: 6
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: Kushal Tirumala
 */
public class ComplexJUTest extends junit.framework.TestCase
{
    public Complex c1, c2, c3;


    @Test
    public void testConstructor1Param()
    {
        c1 = new Complex( 1 );
        assertEquals( "1.0 + 0.0i", c1.toString());;

    }


    @Test
    public void testConstructor2Param()
    {
        c1 = new Complex( 1, 2 );
        assertEquals( 1.0, c1.getA(), 0.01 );
        assertEquals( 2.0, c1.getB(), 0.01 );
    }


    @Test
    public void testAddRealAndComplexNum()
    {
        c1 = new Complex( 1, 2 );
        c2 = c1.add( 3 );
        assertEquals( 4.0, c2.getA(), 0.01 );
        assertEquals( 2.0, c2.getB(), 0.01 );
    }


    @Test
    public void testAdd2ComplexNums()
    {
        c1 = new Complex( 1, 2 );
        c2 = c1.add( new Complex( 3, 4 ) );
        assertEquals( 4.0, c2.getA(), 0.01 );
        assertEquals( 6.0, c2.getB(), 0.01 );
    }


    @Test
    public void testMultiply2ComplexNums()
    {
        c1 = new Complex( 1, 2 );
        c2 = c1.multiply( new Complex( 3, 4 ) );
        assertEquals( -5.0, c2.getA(), 0.01 );
        assertEquals( 10.0, c2.getB(), 0.01 );

    }


    @Test
    public void testMultiplyRealAndComplexNum()
    {
        c1 = new Complex( 1, 2 );
        c2 = c1.multiply( 2 );
        assertEquals( 2.0, c2.getA(), 0.01 );
        assertEquals( 4.0, c2.getB(), 0.01 );

    }


    @Test
    public void testAbsoluteValue()
    {
        c1 = new Complex( 3, 4 );
        double ans = c1.abs();
        assertEquals( 5.0, ans, 0.01 );
    }

    // public static junit.framework.Test suite()
    // {
    // return new JUnit4TestAdapter( ComplexJUTest.class );
    // }
    //
    // public static void main( String args[] )
    // {
    // org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    // }
}
