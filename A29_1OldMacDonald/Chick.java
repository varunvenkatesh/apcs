/**
 * 
 * Chick class to represent a "chick"
 *
 * @author ktirumala940
 * @version Oct 21, 2015
 * @author Period: 6
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: Kushal Tirumala
 */
class Chick implements Animal
{

    /** fields for containing attributes */
    private String sound;

    /** fields for containing attributes */
    private String type;

    /** fields for containin attribute */
    private String childishSound;


    /**
     * Chick constructor
     * 
     * @param type
     *            type of animal
     * @param sound
     *            sound of animal
     * @param childishSound
     *            the childish sound of animal
     */
    public Chick( String type, String childishSound, String sound )
    {
        this.sound = sound;
        this.type = type;
        this.childishSound = childishSound;
    }


    /**
     * gets the sound of the animal
     * 
     * @return the sound of the animal
     */
    public String getSound()
    {
        double rand = Math.random();
        if ( rand >= 0.5 )
        {
            return sound;
        }
        else
        {
            return childishSound;
        }
    }


    /**
     * gets the type of the animal
     * 
     * @return the type of the animal
     */
    public String getType()
    {
        return type;
    }

}