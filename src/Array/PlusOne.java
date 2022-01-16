package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
		//System.out.println(Arrays.toString(plusOne(new int[] {4,3,2,1})));
		System.out.println(Arrays.toString(plusOne(new int[] {9})));
		//System.out.println(Arrays.toString(plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));

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

	// my solution, some input works, some does not
	public static int[] plusOne1(int[] digits) {

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

	
	//medium.com solution
	public static int[] plusOne(int[] digits) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (digits == null || digits.length == 0) {
			int[] temp = {1};
			return temp;
		}

		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				carry = carry + digits[i] + 1;
			} else {
				carry += digits[i];
			}
			result.add(0, carry % 10);
			carry /= 10;
		}

		if (carry == 1) {
			result.add(0, 1);
		}
		int resultArray[] = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}






}
