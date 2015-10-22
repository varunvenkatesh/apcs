import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import java.applet.AudioClip;


/**
 * Fortune teller class
 * 
 * @author Kushal Tirumala
 * @version 10/19/2015
 * 
 * @author Period - 6
 * @author Assignment - Lab 12.3: Fortune Teller
 * 
 * @author Sources - Kushal Tirumala
 */
public class FortuneTeller extends JApplet implements ActionListener
{
    String[] fortunes = { 
        "Hey good job! you will get an A on the richmond essay", 
        "You will get a free dog",
        "you will get a free pig", 
        "you will are now the producer of mean girls",
        "you will get a new computer and 100k in IBM cloud credit", 
        "you will win a purple popsicle",
        "you will get a free meal with bacon and wine", 
        "you will get a girlfriend",
        "you will beat usain bolt in a 100 meter dash", 
        "you will get the chance to meet donald trump and roast him" };

    private JTextField display;

    private AudioClip ding;


    /**
     * initial method
     */
    public void init()
    {
        ding = getAudioClip( getDocumentBase(), "ding.wav" );

        display = new JTextField( "  Press \"Next\" to see your fortune...", 30 );
        display.setBackground( Color.WHITE );
        display.setEditable( false );

        JButton go = new JButton( "Next" );
        go.addActionListener( this );

        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add( display );
        c.add( go );
    }


    /**
     * action performed method from action listener class
     * 
     * @param e
     *            Action event
     */
    public void actionPerformed( ActionEvent e )
    {
        ding.play();
        Random rand = new Random();

        display.setText( "  " + fortunes[rand.nextInt( 10 )] );
    }
}
