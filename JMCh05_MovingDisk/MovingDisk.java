import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * 
 * Draws a animating "ball"/disk that moves around in the JFrame
 * 
 * 
 * @author Kushal Tirumala
 * @version Aug 31, 2015
 * @author Period: 6
 * @author Assignment: JMCh05_MovingDisk
 *
 * @author Sources: Kushal Tirumala
 */
public class MovingDisk extends JPanel implements ActionListener
{
    private int time;


    /**
     * Constructor for the MovingDisk class. Starts a timer to control the
     * movement of the disk.
     */
    public MovingDisk()
    {
        time = 0;
        Timer clock = new Timer( 30, this );
        clock.start();
    }


    /**
     * Paints the JFrame
     * 
     * @param g
     *            Graphics object
     */
    public void paintComponent( Graphics g )
    {
        int x = 150 - (int)( 100 * Math.cos( 0.005 * Math.PI * time ) );
        int y = 130 - (int)( 75 * Math.sin( 0.005 * Math.PI * time ) );
        int r = 20;

        Color sky;
        if ( y > 130 )
        {
            sky = Color.BLACK;
        }
        else
        {
            sky = Color.CYAN;
            setBackground( sky );
            super.paintComponent( g );
        }
        g.setColor( Color.ORANGE );
        g.fillOval( x - r, y - r, 2 * r, 2 * r );
    }


    /**
     * Runs every time an "action" is performed, or in this class whenever the
     * clock (from the constructor) fires an ActionEvent.
     * 
     * @param e
     *            the Action Event needed to trigger this method (fired by the
     *            clock)
     */
    public void actionPerformed( ActionEvent e )
    {
        time++;
        repaint();
    }


    /**
     * 
     * Main function for running/testing the MovingDisk Class. Ignore if you're
     * not making adjustments/changes to this class
     * 
     * @param args
     *            any command-line argument u may have
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "Moving Disk" );
        w.setSize( 300, 150 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container c = w.getContentPane();
        c.add( new MovingDisk() );
        w.setResizable( false );
        w.setVisible( true );
    }
}
