/**
 * A class to solve various loop problems
 * 
 * @author Kushal Tirumala
 * @version 9/21/2015
 * 
 *          Period - 6 Assignment - A12.1 - FunLoops
 * 
 *          Sources - Kushal Tirumala
 */
public class FunLoops {
    /**
	 * finds the first "n" magic squares
	 * 
	 * @param n
	 *            the magic square
	 */
    public void magicsquare(int n) {
        System.out.println("Magic Squares");

		int numberFound = 0;
		int i = 0;
		while (numberFound < n) {
			if (ifMagicSquare(i)) {
				numberFound++;
				System.out.println(i * i);
			}
			i++;
		}
	}

	/**
	 * returns if a certain number is a magic square or not
	 * 
	 * @param num
	 *            the number to check
	 * @return if the number is a magic square
	 */
	public static boolean ifMagicSquare(int num) {
		boolean ans = false;
		int square = num * num;
		if (num == 1) {
			ans = true;
		} else {
			for (int i = 0; i < square; i++) {
				int csum = sumOfNumbers(i);
				if (csum > square) {
					break;
				}
				if (csum == square) {
					ans = true;
					break;
				}

			}
		}
		return ans;
	}

	/**
	 * A method for finding the sum of consecutive numbers starting from 1
	 * 
	 * @param num
	 *            number to add all the consecutive numbers till
	 * @return the sum of the consecutive numbers leading up to "num"
	 */
	public static int sumOfNumbers(int num) {
		int ans = 0;
		for (int i = 0; i < num; i++) {
			ans += i;
		}
		return ans;
	}

	/**
	 * A LCM method for finding the least common multiple between two numbers
	 * 
	 * @param a
	 *            first number
	 * @param b
	 *            second number
	 * @return the LCM
	 */
	public int lcm(int a, int b) {
		int ans = a * b;
		for (int i = 1; i < a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				ans = i;
				break;
			}
		}
		return ans;
	}

	/**
	 * Main method for testing the various methods of the class
	 * 
	 * @param args
	 *            command-line argument (not used here)
	 */
	public static void main(String[] args) {
		FunLoops fun = new FunLoops();

		fun.magicsquare(4);
		System.out.println();
		System.out.println("LCM (15, 18) = " + fun.lcm(15, 18));
		System.out.println("LCM (40, 12) = " + fun.lcm(40, 12));
		System.out.println("LCM (2, 7) = " + fun.lcm(2, 7));
		System.out.println("LCM (100, 5) = " + fun.lcm(100, 5));
		System.out.println();

		fun.magicsquare(10);

	}
}