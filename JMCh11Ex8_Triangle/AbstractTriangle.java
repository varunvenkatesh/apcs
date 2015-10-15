/**
 * The abstract class <code>Triangle</code> requires methods for calculating the
 * area and the perimeter as specified the type of triangle. A method to
 * calculate the ratio of the area to the perimeter is provided. The class works
 * for equilateral triangles and for right isosceles triangles; which can be
 * specified with the length of a side.
 * 
 * @author Kushal Tirumala
 * @version 10/14/2015
 * 
 * @author 6
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Kushal Tirumala
 */
public abstract class AbstractTriangle {
	/**
	 * side of the triangle
	 */
	public double side;

	/**
	 * parameter constructor
	 * 
	 * @param side
	 *            side of triangle
	 */
	public AbstractTriangle(double side) {
		this.side = side;
	}

	/**
	 * no parameter constructor
	 */
	public AbstractTriangle() {
		// no parameters
	}

	/**
	 * area of triangle
	 * 
	 * @return area
	 */
	public abstract double getArea();

	/**
	 * perimeter of triangle
	 * 
	 * @return triangle
	 */
	public abstract double getPerimeter();

	/**
	 * ratio of area to perimeter
	 * 
	 * @return ratio
	 */
	public double getRatio() {
		return getArea() / getPerimeter();
	}

	/**
	 * getter method for the side field
	 * 
	 * @return side of triangle
	 */
	public double getSide() {
		return side;
	}
}
