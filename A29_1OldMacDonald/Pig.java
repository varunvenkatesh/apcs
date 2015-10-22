/**
 * 
 * A pig class to represent a "pig"
 *
 * @author ktirumala940
 * @version Oct 21, 2015
 * @author Period: 6
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: Kushal Tirumala
 */
class Pig implements Animal
{
    /** fields for containing attributes */
    private String sound;

    /** fields for containing attributes */
    private String type;


    /**
     * pig constructor
     * 
     * @param type
     *            type of animal
     * @param sound
     *            sound of animal
     */
    public Pig( String type, String sound )
    {
        this.sound = sound;
        this.type = type;
    }


    /**
     * gets the sound of the animal
     * 
     * @return sound of the animal
     */
    public String getSound()
    {
        return sound;
    }


    /**
     * gets the type of the animal
     * 
     * @return type of the animal
     */
    public String getType()
    {
        return type;
    }

}