import java.awt.*;
import javax.swing.*;

/**
 * Draws parallel lines
 * 
 * @author Kushal Tirumala
 * @version 9/21/2015
 * 
 *          Period - 6 Assignment - A12.6 - ParallelLines
 * 
 *          Sources - Kushal Tirumala
 */
public class ParallelLines extends JPanel {

    /**
     * paints the JPanel screen
     * @param g Graphics object that controls the JPanel
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        int width = getWidth();
        int height = getHeight();

        drawIllusion(g, width, height);
    }

    /**
     * Draws the parallel lines
     * 
     * @param g Graphics object
     * @param width width of screen/as big as you want grid to be
     * @param height height of screen/as tall as you want grid
     */
    public void drawIllusion(Graphics g, int width, int height) {
        g.setColor(Color.black);
        int nextX = 0;
        int nextY = 0;
        int offset;
        
        for (int i = 0; i < 8; i++) {
            nextX = 0;
            offset = 8 * (i % 4);
            nextX += offset;
            g.drawLine(nextX - 80, nextY, width, nextY);
            for (int j = 0; j < 7; j++) {
                g.fillRect(nextX, nextY, 40, 40);
                nextX += 80;
            }

            nextY += 40;
        }
    }

    /**
     * Mainmethod to test the parallel lines class
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        JFrame w = new JFrame("ParallelLines");
        w.setBounds(100, 100, 640, 480);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ParallelLines panel = new ParallelLines();
        panel.setBackground(Color.WHITE);
        Container c = w.getContentPane();
        c.add(panel);
        w.setResizable(true);
        w.setVisible(true);
    }
}