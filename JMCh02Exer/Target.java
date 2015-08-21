
/**
 *  This program makes an applet that draws 
 *  concentric circles with the common center of 
 *  all the circles being the middle of the panel.
 *  This gives the effect of a target.
 *
 *  @author  TODO: Kushal Tirumala
 *  @version TODO: 8/21/2015  	
 *  @author  Period: 6
 *  @author  Assignment: JMCh02Exer
 *
 *  @author  Sources: Kushal Tirumala  	
 */
import java.awt.*;
import javax.swing.*;


public class Target extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		// initialize radius to store the radius of each circle

		int radius = 50;

		// create the first big circle
		g.setColor(Color.GRAY);
		g.fillOval(xCenter - (radius / 2), yCenter - (radius / 2), 50, 50);

		// create the second middle-sized circle
		g.setColor(Color.white);
		radius = 30;
		g.fillOval(xCenter - (radius / 2), yCenter - (radius / 2), radius, radius);

		// create the third and smallest circle
		g.setColor(Color.gray);
		radius = 10;
		g.fillOval(xCenter - (radius / 2), yCenter - (radius / 2), radius, radius);

		/**
		 * NOTE: (xCenter - (radius/2)) basically makes it so that the circles
		 * use the same center of the panel as the center of the circle, despite
		 * the individual radius (which is changed with each circle)
		 */

	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Red Cross");
		window.setBounds(300, 300, 200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RedCross panel = new RedCross();
		panel.setBackground(Color.WHITE);
		Container c = window.getContentPane();
		c.add(panel);
		window.setVisible(true);
	}
}
