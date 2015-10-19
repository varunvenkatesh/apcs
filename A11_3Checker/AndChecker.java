
public class AndChecker implements Checker {
	/**
	 * Checker objects
	 */

	private Checker a, b;

	/**
	 * constructor
	 * 
	 * @param a
	 *            first Checker
	 * @param b
	 *            second Checker
	 */
	public AndChecker(Checker a, Checker b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * accept method that returns if BOTH checkers accept text
	 */
	public boolean accept(String text) {
		return (a.accept(text) && b.accept(text));
	}
}
