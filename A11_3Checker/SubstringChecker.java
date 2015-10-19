
public class SubstringChecker implements Checker
{
	private String textToCheck;
	
	public SubstringChecker(String text) {
		textToCheck = text;
	}
	
	public boolean accept(String text) {
		
		return text.contains(textToCheck);
		
	}
}
