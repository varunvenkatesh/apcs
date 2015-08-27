/**
 *  A class for a creating a "cylinder" that has the
 *  ability to calculate its own volume, based on an inputed
 *  radius and height
 *
 *  @author  Kushal Tirumala    
 *  @version 8/25/2015
 *  @author  Period: 6
 *  @author  Assignment: JMCh03Ex12_Cylinder
 *
 *  @author  Sources: Kushal Tirumala
 */
public class Cylinder
{
    private Circle base;
    
    private double height;
    
    public Cylinder(double r, double h) {
        
        height = h;
        base = new Circle(r);
        
    }
    
    public double getVolume() {
        return (base.getArea() * height);
    }
    
    
}
