
/**
 *  An applet program that creates a red cross in the center
 *  of the panel
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

public class RedCross extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method
									// to paint the background
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		g.setColor(Color.RED);
		// vertical rectangle
		g.fillRect(xCenter, yCenter - 45, 10, 100);
		// horizontal rectangle
		g.fillRect(xCenter - 45, yCenter, 100, 10);
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
