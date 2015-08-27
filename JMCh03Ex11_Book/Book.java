/**
 *   This is a software implementation of a Book. The abilities
 *   of this class include, creating a book with a set number of page,
 *   establishing accessor methods, and allowing the pages to be "turned"
 *
 *  @author  Kushal Tirumala
 *  @version 8/24/2015
 *  @author  Period: 6
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: Kushal Tirumala
 */

public class Book
{
   private int numPages;
   private int currentPage;
   
   public Book (int numPages) {
       this.numPages = numPages;
       this.currentPage = 1;
       
   }
   
   
   public int getNumPages() {
       return numPages;
   }
   
   
   public int getCurrentPage() {
       return currentPage;
   }
   
   
   public void nextPage() {
       
       if (currentPage < numPages) {
           currentPage++;
       }
       
   }
   
}

