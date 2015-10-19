
public class NotChecker implements Checker
{
	private Checker a;
	
    public NotChecker(Checker a) {
    	this.a = a;
    }
	
	public boolean accept(String text) {
		return !a.accept(text);
	}
    
}
