package String;

public class ReverseInteger {

	public static void main(String[] args) {
		
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
		System.out.println(reverse(2147483647));
		System.out.println(reverse(-2147483648));
		
		

	}

	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. 
	 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

	Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
	 */

	public static int reverse(int x) {

		int rev = 0;
		
		while (x != 0) {
			//pop operation
			int pop = x % 10;
			x = x / 10;
			
			// checking integer range a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            
            //push operation
			rev = rev * 10 + pop;
		}
		return rev;
	}
	

}
