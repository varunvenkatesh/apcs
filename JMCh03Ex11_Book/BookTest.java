/**
 *  This is a class that tests the Book class.
 *
 *  @author  Kushal Tirumala
 *  @version 8/24/2015
 *  @author  Period: 6
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: Kushal Tirumala
 */

public class BookTest
{
    public static void main (String args[]) {
        Book bk = new Book(3);
        System.out.println(bk.getNumPages());
        System.out.println(bk.getCurrentPage());
        
        for (int i = 0; i < 3; i++) {
            
            bk.nextPage();
            System.out.println(bk.getCurrentPage());
            
        }
        
    }
}
