/**
 * This is a class that tests the Card class.
 *
 *  @author  Kushal Tirumala
 *  @version 08/26/2015
 *  @author  Period: 6
 *  @author  Assignment: APCSElevensActivity1
 *
 *  @author  Sources: Kushal Tirumala
 */
public class CardTester
{
	/**
	 * The main method in this class checks the Card operations for
	 * consistency.
	 * @param args is not used.
	 */
    public static void main( String[] args )
    {
//Card[] cardArray = {new Card("ace", "clubs", 1), new Card("ace", "clubs", 1), new Card("six", "hearts", 6)};
//        
//        for (int i = 0; i < cardArray.length; i++) {
//            if (!cardArray[i].rank().equals("six")) { 
//                System.out.println("**** " + cardArray[i].rank() + " of " + cardArray[i].suit() +" #" + (i+1) + " Tests ****");
//                System.out.println("  rank: " + cardArray[i].rank());
//            } else {
//                System.out.println("**** " + cardArray[i].rank() + " of " + cardArray[i].suit() + " Tests ****");
//                String sixToInteger = "6";
//                System.out.println("  rank: " + sixToInteger);
//            }
//            
//            System.out.println("  suit: " + cardArray[i].suit());
//            System.out.println("  pointValue: " + cardArray[i].pointValue());
//            if (!cardArray[i].rank().equals("six")) { 
//                System.out.println("  toString: " + cardArray[i].toString());
//            } else {
//                System.out.println( x );
//            }
//            System.out.println();
//        }
//        
//        System.out.println("**** matches Tests ****");
//        
//        if (cardArray[0].matches( cardArray[1] ) || cardArray[1].matches( cardArray[2] ) || 
//                        cardArray[0].matches( cardArray[2] ) ) {
//            System.out.println( "matching: true" );
//            System.out.println( "not matching: false" );
//        }
        Card aceClubs1 = new Card("ace", "clubs", 1);
        
        System.out.println("**** ace of clubs #1 Tests ****");
        System.out.println("  rank: " + aceClubs1.rank());
        System.out.println("  suit: " + aceClubs1.suit());
        System.out.println("  pointValue: " + aceClubs1.pointValue());
        System.out.println("  toString: " + aceClubs1.toString());
        System.out.println();
        
        Card aceClubs2 = new Card("ace", "clubs", 1);
        
        System.out.println("**** ace of clubs #2 Tests ****");
        System.out.println("  rank: " + aceClubs2.rank());
        System.out.println("  suit: " + aceClubs2.suit());
        System.out.println("  pointValue: " + aceClubs2.pointValue());
        System.out.println("  toString: " + aceClubs2.toString());
        System.out.println();

        Card sixHearts6 = new Card("6", "hearts", 6);
        
        System.out.println("**** six of hearts Tests ****");
        System.out.println("  rank: " + sixHearts6.rank());
        System.out.println("  suit: " + sixHearts6.suit());
        System.out.println("  pointValue: " + sixHearts6.pointValue());
        System.out.println("  toString: " + sixHearts6.toString());
        System.out.println();
        
        
        System.out.println("**** matches Tests ****");
        if (aceClubs1.matches( aceClubs2 ) || aceClubs2.matches( sixHearts6 ) || 
                        aceClubs1.matches( sixHearts6 ) ) {
          System.out.println( "matching: true" );
          System.out.println( "not matching: false" );
      }

    }
}

/*
**** ace of clubs #1 Tests ****
rank: ace
suit: clubs
pointValue: 1
toString: ace of clubs (point value = 1)

**** ace of clubs #2 Tests ****
rank: ace
suit: clubs
pointValue: 1
toString: ace of clubs (point value = 1)

**** six of hearts Tests ****
rank: 6
suit: hearts
pointValue: 6
toString: 6 of hearts (point value = 6)

**** matches Tests ****
matching: true
not matching: false
*/