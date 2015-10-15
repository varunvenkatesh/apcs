/**
 * Calculates the area and the perimeter of a right triangle as specified by the
 * abstract Triangle superclass.
 * 
 * @author Kushal Tirumala
 * @version 10/14/2015
 * 
 * @author 6
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Kushal Tirumala
 */
public class RightTriangle extends AbstractTriangle {
	/**
	 * no parameter contructor
	 */
	public RightTriangle() {
		// no parameter
	}

	/**
	 * side constructor
	 * 
	 * @param side
	 *            side of triangle
	 */
	public RightTriangle(double side) {
		super(side);
	}

	/**
	 * returns the area of the triangle
	 * 
	 * @return area
	 */
	public double getArea() {
		return side * side / 2;
	}

	/**
	 * returns the perimeter of the triangle
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return side * (2 + Math.sqrt(2));
	}

}
