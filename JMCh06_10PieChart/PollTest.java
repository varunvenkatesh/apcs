import java.awt.Graphics;


/**
 * Tests PollDisplayPanel class
 * 
 * @author Kushal Tirumala
 * @version 9/2/2015
 * @author Period: 6
 * @author Assignment: JMCh06_10PieChart
 *
 * @author Sources: Kushal Tirumala
 */
public class PollTest
{
    /**
     * Testing out the PollDisplayPanel class
     * 
     * @param args
     *            command-line args, not used here
     */
    public static void main( String[] args )
    {
        PollDisplayPanel votingMachine = new PollDisplayPanel( "Tami", "Brian", "Liz" );
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println( votingMachine.toString() );
    }

}
