class OldMacDonald
{
    /**
     * 
     * Old MCD testing method
     * 
     * @param args
     *            command line arguments
     */
    public static void main( String[] args )
    {
        Cow c = new Cow( "cow", "moo" );
        System.out.println( c.getType() + " goes " + c.getSound() );

        Farm newFarm = new Farm();
        newFarm.animalSounds();
    }
}
