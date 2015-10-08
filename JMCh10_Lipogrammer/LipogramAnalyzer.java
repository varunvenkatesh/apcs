/**
 * Lipogram analyzer
 * 
 * @author Kushal Tirumala
 * @version 9/30/2015
 * 
 * @author Period - 6
 * @author Assignment - JMCh10 Lipogrammer
 * 
 * @author Sources - Kushal Tirumala
 */
public class LipogramAnalyzer
{
    private String text;

    int endPos;


    /**
     * Constructor: Saves the text string
     * 
     * @param text
     *            String to analyze
     */
    public LipogramAnalyzer( String text )
    {
        this.text = text;
    }


    /**
     * Returns the text string with all characters equal to letter replaced with
     * '#'.
     * 
     * @param letter
     *            character to replace
     * @return text string with all characters equal to letter replaced with '#'
     */
    public String mark( char letter )
    {

        String ans = text.replace( letter, '#' );

        return ans; // !!!Fix this
    }


    /**
     * Returns a String that concatenates all "offending" words from text that
     * contain letter; the words are separated by '\n' characters; the returned
     * string does not contain duplicate words: each word occurs only once;
     * there are no punctuation or whitespace characters in the returned string.
     * 
     * @param letter
     *            character to find in text
     * @return String containing all words with letter
     */
    public String allWordsWith( char letter )
    {
        String result = "";
        String textToCheck = text;
        int position = 0;
        while ( position < text.length() - 1 )
        {

            position = textToCheck.indexOf( letter, endPos );
            if (position == -1) 
                break;
            String word = this.extractWord( position );
            System.out.println( position + " " + word + " " + result.indexOf( word + "\n" ) );
            if ( ( result.indexOf( "\n" + word + "\n" ) == -1 ) && !result.startsWith( word+"\n" ))
            {

                System.out.println( "at position: " + position + " word is " + word + " endPos " + endPos );
                result += word + "\n";

            }

            position = endPos;

        }

        return result;
    }


    /**
     * Returns the word that contains character at pos excluding any punctuation
     * or whitespace.
     * 
     * @param pos
     *            location of character
     * 
     * @return word that contains character at pos
     */
    public String extractWord( int pos )
    {
        int indexStarting = pos;
        while ( indexStarting >= 0 && Character.isLetter( text.charAt( indexStarting ) ) )
        {

            indexStarting--;
        }

        int indexFinal = pos;

        while ( indexFinal < text.length() && Character.isLetter( text.charAt( indexFinal ) ) )
        {
            indexFinal++;

        }

        endPos = indexFinal;

        return text.substring( indexStarting + 1, indexFinal );
    }
}
