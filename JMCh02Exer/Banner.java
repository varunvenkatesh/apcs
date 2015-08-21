
/**
 *  An applet in which a "banner" of a sort
 *  moves across the screen at a fixed rate. The Banner
 *  changes the words inside based on the time (the clock) -
 *  right now the banner switches between "Java is Best" and
 *  "East or West:
 *
 *  @author  TODO: Kushal Tirumala
 *  @version TODO: 8/21/2015  	
 *  @author  Period: 6
 *  @author  Assignment: JMCh02Exer
 *
 *  @author  Sources: Kushal Tirumala  	
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet implements ActionListener {
	private int xPos, yPos; // hold the coordinates of the banner

	private int msgID = 1;

	public void init() {
		Container c = getContentPane();
		c.setBackground(Color.WHITE);

		// get the INITIAL position of the banner

		xPos = c.getWidth();
		yPos = c.getHeight() / 2;

		Timer clock = new Timer(30, this);
		clock.start();
	}

	// Called automatically after a repaint request
	public void paint(Graphics g) {
		super.paint(g);

		// set Color to black because background is white

		g.setColor(Color.black);

		// change the string to display ("toDisplay) based
		// on the msgID, which changed every 30 milliseconds

		String toDisplay;
		if (msgID == 1) {
			toDisplay = "East or West";
		} else {
			toDisplay = "Java is Best";
		}

		// draw the banner

		g.drawString(toDisplay, xPos, yPos);
	}

	// Called automatically when the timer fires
	public void actionPerformed(ActionEvent e) {
		Container c = getContentPane();

		// change the msgID count every 30 millesconds

		msgID = -msgID;

		// Adjust the horizontal position of the banner:
		xPos--;
		if (xPos < -100) {
			xPos = c.getWidth();
		}

		// Set the vertical position of the banner:
		yPos = c.getHeight() / 2;

		repaint();
	}
}
