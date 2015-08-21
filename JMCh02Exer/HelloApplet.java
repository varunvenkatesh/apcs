
/**
 *  An applet program that creates a blue rectangle with 
 *  the white text "Hello World" inside of it.
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

public class HelloApplet extends JApplet {

	public void init() {
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
	}

	public void paint(Graphics g) {
		super.paint(g); // call JApplet's paint method
						// to paint the background
		g.setColor(Color.BLUE);
		g.fillRect(25, 40, 150, 45); // draw a rectangle 150 by 45
		g.setColor(Color.white);
		g.drawString("Hello, Applet!", 60, 65);
	}
}