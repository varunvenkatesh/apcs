import java.util.Scanner;

/**
 *  Tests the Cylinder class by allowing the user
 *  to create a "cylinder" and it returns a volume
 *
 *  @author  Kushal Tirumala    
 *  @version 8/25/2015
 *  @author  Period: 6
 *  @author  Assignment: JMCh03Ex12_Cylinder
 *
 *  @author  Sources: Kushal Tirumala
 */
public class CylinderTest
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print("Enter the radius and the height: ");
        double r = kb.nextDouble();
        double h = kb.nextDouble();
        
        Cylinder iCylinder = new Cylinder (r, h);
        
        System.out.println("radius = " + r + " height = " + h + " volume = " + iCylinder.getVolume());
        
        kb.close();
        
    }
}
