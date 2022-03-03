package Math;

public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27)); //true
		System.out.println(isPowerOfThree(0));  //false
		System.out.println(isPowerOfThree(9));  //true

		System.out.println(isPowerOfThree2(27)); //true
		System.out.println(isPowerOfThree2(0));  //false
		System.out.println(isPowerOfThree2(9));  //true
	}
	/*
	 * Given an integer n, return true if it is a power of three. Otherwise, return false.
	An integer n is a power of three, if there exists an integer x such that n == 3x.
	 */

	//time:  O(log_3n) The number of divisions is given by that logarithm.
	//space: O(1)
	public static boolean isPowerOfThree(int n) {
		//n != 0, otherwise the while loop will never finish. 
		//also, for negative numbers, the algorithm does not make sense.
		if (n < 1)
			return false;
		
		//if a number n is a power of a number b is to keep dividing n by b as long as the remainder is 0.
		// n = b^x
		// n = b*b*b..b   (x times)
		while (n % 3 == 0) {
			n = n / 3;
		}
		
		return n == 1;
	}
	
	//Time complexity: O(1) We are only doing one operation.
	//Space complexity: O(1) We are not using any additional memory.
	public static boolean isPowerOfThree2(int n) {
		// The maximum power of 3 value that integer can hold is 1162261467 ( 3^19 )
		return n > 0 && 1162261467 % n == 0;
	}
	
	
}
