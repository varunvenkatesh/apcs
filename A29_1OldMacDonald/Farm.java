import java.util.*;


/**
 * Farm class to test implementations of the Animal class
 * 
 * @author Kushal Tirumala
 * @version 10/20/2015
 * 
 *          Period - 6 Assignment - A29.1 Old MacDonald
 * 
 *          Sources - Kushal Tirumala
 */
public class Farm
{
    /** fields for containing attributes */
    private Animal[] a = new Animal[3];


    /**
     * Farm constructor
     */
    public Farm()
    {
        // a[0] = new Cow("cow","moo moo");
        a[0] = new NamedCow( "cow", "Elsie", "moo" );
//        a[1] = new Chick( "chick", "cluck cluck" );
        a[1] = new Chick("chick", "cluckity cluck", "cheep");
        a[2] = new Pig( "pig", "oink oink" );
    }


    /**
     * testing method to be run elsewhere
     */
    public void animalSounds()
    {
        for ( int i = 0; i < a.length; i++ )
        {
            System.out.println( a[i].getType() + " goes " + a[i].getSound() );
        }
        NamedCow named = (NamedCow)a[0];
        System.out.println( named.getType() + " is named " + named.getName() );
    }

}
