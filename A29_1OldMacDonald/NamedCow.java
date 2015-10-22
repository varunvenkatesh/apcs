/**
 * 
 * Named cow class to represent a "named cow" - a cow that is named
 *
 * @author ktirumala940
 * @version Oct 21, 2015
 * @author Period: 6
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: Kushal Tirumala
 */
class NamedCow extends Cow
{
    /** fields for containing attributes */
    private String name;


    /**
     * Named cow constructor
     * 
     * @param type
     *            type of animal
     * @param name
     *            name of cow
     * @param sound
     *            sound of animal
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );
        this.name = name;
    }


    /**
     * gets the name of the cow
     * 
     * @return the name of the cow
     */
    public String getName()
    {
        return name;
    }

}
