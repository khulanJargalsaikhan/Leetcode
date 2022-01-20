package String;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome(" "));
	}
	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase 
	 * letters and removing all non-alphanumeric characters, it reads the same forward and backward.
	 * Alphanumeric characters include letters and numbers.

	Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
	 */

	//solution 1
	public static boolean isPalindrome(String s) {

		s = s.toLowerCase();
		s = s.replaceAll("[^A-Za-z0-9]", "");

		int len = s.length()-1;

		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) == s.charAt(len))
				len--;
			else
				return false;
		}

		return true;
	}

	//solution 2
	public static boolean isPalindrome2(String s) {
		s = s.toLowerCase();
		if (s.length() == 0) {
			return false;
		}
		int i = 0;
		int j = s.length() - 1;
		while (j > i) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			} else if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			} else if (s.charAt(i) != s.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}






}
