/**
 * 
 * Testing class for the Back to School Classes
 *
 * @author ktirumala940
 * @version Oct 13, 2015
 * @author Period: 6
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: Kushal
 */
public class BackToSchool
{
    /**
     * 
     * Main testing method
     * 
     * @param args
     *            command-line arguments
     */
    public static void main( String[] args )
    {
        Person bob = new Person( "Coach Bob", 27, "M" );
        System.out.println( bob );

        Student lynne = new Student( "Lynne Brooke", 16, "F", "HS95129", 3.5 );
        System.out.println( lynne );

        Teacher mrJava = new Teacher( 
            "Duke Java", 34, "M", "Computer Science", 50000 );
        System.out.println( mrJava );

        CollegeStudent ima = new CollegeStudent( 
            "Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English" );
        System.out.println( ima );
    }
}
