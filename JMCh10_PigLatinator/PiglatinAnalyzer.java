import java.util.Scanner;
 
 
/**
 * Pig latin analyzer class
 * 
 * @author Kushal Tirumala
 * @version 10/13/2015
 * 
 * @author Period - 6
 * @author Assignment - TODO Assignment Name
 * 
 * @author Sources - Kushal Tirumala
 */
public class PiglatinAnalyzer
{
    /**
     * text to analyze
     */
    private String text;
 
 
    // Constructor: saves the text string
    public PiglatinAnalyzer( String text )
    {
        this.text = text;
    }
 
 
    /**
     * Converts a string to it piglatin form according to the following rules:
     * a. If there are no vowels in englishWord, then pigLatinWord is just
     * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u',
     * and their uppercase counterparts.) b. Else, if englishWord begins with a
     * vowel, then pigLatinWord is just englishWord + "yay". c. Otherwise (if
     * englishWord has a vowel in it and yet doesn't start with a vowel), then
     * pigLatinWord is end + start + "ay", where end and start are defined as
     * follows: 1. Let start be all of englishWord up to (but not including) its
     * first vowel. 2. Let end be all of englishWord from its first vowel on. 3.
     * But, if englishWord is capitalized, then capitalize end and
     * "uncapitalize" start.
     *
     * @return piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String phraseToTranslate = text;
        String translation = "";
 
        String[] words = phraseToTranslate.split( " " );
        for ( int i = 0; i < words.length; i++ )
        {
            String trans = wordToPigLatin( words[i] );
            // System.out.println("I love Java");
            System.out.println( trans );
            translation += trans + " ";
 
        }
 
        return translation;
    }
 
 
    /**
     * Converts an "english" word to its piglatin form
     *
     * @param englishWord
     *            a string representing an english word
     * @return piglatin form of the english word
     */
    public String wordToPigLatin( String englishWord )
    {
        String pigLatinWord = "";
        String vowel = "aeiouAEIOU";
        if ( englishWord.contains( "-" ) )
        {
            return englishWord;
        }
        else if ( !hasVowel( englishWord ) )
        {
            pigLatinWord += englishWord + "ay";
        }
        else if ( vowel.indexOf( englishWord.charAt( 0 ) ) != -1 )
        {
            if ( Character.isLetter( englishWord.charAt( englishWord.length() - 1 ) ) )
                pigLatinWord += englishWord + "yay";
            else
                pigLatinWord += englishWord.substring( 0, englishWord.length() - 2 ) + "yay"
                    + englishWord.charAt( englishWord.length() - 1 );
        }
        else
        {
            String start, end;
            int firstv = firstVowel( englishWord );
            System.out.println( firstv );
            start = englishWord.substring( 0, firstv );
            end = englishWord.substring( firstv );
            if ( firstCapitalized( englishWord ) )
            {
                System.out.println( "found one yo" );
                end = capatalize( end );
                start = uncapatalize( start );
            }
            pigLatinWord = end + start + "ay";
        }
 
        return pigLatinWord;
    }
 
 
    public boolean hasVowel( String word )
    {
        word = word.toLowerCase();
        return ( word.contains( "a" ) || word.contains( "e" ) || word.contains( "i" ) || word.contains( "o" )
            || word.contains( "u" ) );
    }
 
 
    public int firstVowel( String word )
    {
        int ans = -1;
        String vowel = "aeiouAEIOU";
        for ( int i = 0; i < word.length(); i++ )
        {
            if ( vowel.indexOf( word.charAt( i ) ) != -1 )
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
 
 
    public boolean firstCapitalized( String word )
    {
        return word.toUpperCase().charAt( 0 ) == word.charAt( 0 );
    }
 
 
    public String capatalize( String word )
    {
        return word.toUpperCase().charAt( 0 ) + word.substring( 1 );
    }
 
 
    public String uncapatalize( String word )
    {
        return word.toLowerCase().charAt( 0 ) + word.substring( 1 );
    }
 
 
    public String strip( String word )
    {
        String ans = "";
        String[] words = word.replaceAll( "[^a-zA-Z ]", "" ).toLowerCase().split( "\\s+" );
        for ( String oneword : words )
        {
            ans += oneword;
        }
        return ans;
    }
 
 
    public String addPunc(String punc, String word) {
        String ans = "";
 
        if (punc.contains("\"")) {
            ans+= "\"" + word + "\"";
        }
        if(punc.contains( "." )) {
           ans+=".";
        }
         
        return ans;
    }
}