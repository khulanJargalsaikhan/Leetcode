package Array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[] {4,3,2,1})));
		System.out.println(Arrays.toString(plusOne(new int[] {9})));

	}

	/*
	 * You are given a large integer represented as an integer array digits, where each digits[i] is the 
	 * ith digit of the integer. The digits are ordered from most significant to least significant 
	 * in left-to-right order. The large integer does not contain any leading 0's.

	Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
	 */

	public static int[] plusOne(int[] digits) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int digit : digits) {
			sb.append(digit);
		}
		
		int sbInt = Integer.parseInt(sb.toString());
		int total = sbInt + 1;
		
		String totalString = String.valueOf(total);
		
		
		int[] arr = new int[totalString.length()];
		
		for (int i=0; i<totalString.length(); i++) {
			arr[i] = Integer.parseInt(totalString.substring(i,i+1));
		}
		
		
		return arr;
	}
	
	
	
	
	

}
