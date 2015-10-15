/**
 * Calculates the area and the perimeter of an equilateral triangle as specified
 * by the abstract Triangle superclass.
 * 
 * @author Kushal Tirumala
 * @version 10/14/2015
 * 
 * @author 6
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Kushal Tirumala
 */
public class EquilateralTriangle extends AbstractTriangle
{
    /**
     * no parameter constructor
     */
    public EquilateralTriangle()
    {
        // no parameters
    }


    /**
     * parameter constructor
     * 
     * @param side
     *            one side of equilateral triangle
     */
    public EquilateralTriangle( double side )
    {
        super( side );
    }


    /**
     * area of triangle
     * 
     * @return area
     */
    public double getArea()
    {
        return ( Math.sqrt( 3 ) * side * side ) / 4;
    }


    /**
     * perimeter of triangle
     * 
     * @return perimeter
     */
    public double getPerimeter()
    {
        return 3 * side;
    }
}