
//  This program shows simple graphics in a window.

import java.awt.*;
import javax.swing.*;

public class HelloGraphics extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method
									// to paint the background
		g.setColor(Color.RED);

		// Draw a 150 by 45 rectangle with the upper-left
		// corner at x = 25, y = 40:
		g.drawRect(20, 40, 150, 45);

		g.setColor(Color.BLUE);

		// Draw a string of text starting at x = 60, y = 25:
		g.drawString("Hello, Graphics!", 55, 65);
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Graphics Demo");
		// Set this window's location and size:
		// upper-left corner at 300, 300; width 200, height 100
		window.setBounds(300, 300, 200, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		HelloGraphics panel = new HelloGraphics();
		panel.setBackground(Color.WHITE); // the default color is light gray
		Container c = window.getContentPane();
		c.add(panel);

		window.setVisible(true);
	}
}
