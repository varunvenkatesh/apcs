import java.awt.*;
import javax.swing.*;


/**
 * This program draws an ornament of nested triangles
 * I HAVE A SMALL PENIS
 * 
 * @author Kushal Tirumala
 * @version 9/152015
 * 
 * @author Period - 6
 * @author Assignment - Ch04 Ex4-16 Ornament
 * 
 * @author Sources - Kushal Tirumala
 */
public class Ornament extends JPanel
{
    /**
     * paintComponent from JPanel super class
     * 
     * @param g
     *            Graphics object that controls the JPanel
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background
        drawTriangles( g, 100, 80, 64 );
    }


    /**
     * 
     * Draws an ornament made of triangles in Graphics g with the base midpoint
     * at (x, y) and base half-length r
     * 
     * @param g
     *            Graphics object reference
     * @param x
     *            x coordinate of midpoint of base
     * @param y
     *            y coordinate of midpoint of base
     * @param r
     *            half the length of base
     */
    public void drawTriangles( Graphics g, int x, int y, int r )
    {
        if ( r < 4 )
        {
            return;
        }

        g.drawLine( x, y - r, x + r, y );
        g.drawLine( x, y - r, x - r, y );
        g.drawLine( x + r, y, x - r, y );

        drawTriangles( g, x + ( r / 2 ), y, r / 2 );
        drawTriangles( g, x - ( r / 2 ), y, r / 2 );

    }


    /**
     * 
     * main function to draw the triangles
     * 
     * @param args
     *            command line arguments
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "Triangles" );
        w.setBounds( 300, 300, 200, 120 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Ornament panel = new Ornament();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
