package String;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseString(new char[] {'h','e','l','l','o'});
		reverseString(new char[] {'H','a','n','n','a','h'});

	}

	/*
	 * Write a function that reverses a string. The input string is given as an array of characters s.
	You must do this by modifying the input array in-place with O(1) extra memory.

	Example 1:
	Input: s = ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]

	Example 2:
	Input: s = ["H","a","n","n","a","h"]
	Output: ["h","a","n","n","a","H"]

	 */

	public static void reverseString(char[] s) {
		
		int n = s.length-1;

		for (int i=0; i<s.length/2; i++, n--) {
			char temp = s[i];
			s[i] = s[n];
			s[n] = temp;
		}
		
		System.out.println(Arrays.toString(s));
	}
}
