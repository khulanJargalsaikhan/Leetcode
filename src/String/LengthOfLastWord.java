package String;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

	}
	/*
	 * Given a string s consisting of some words separated by some number of spaces, 
	 * return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
	 */
	public static int lengthOfLastWord(String s) {

		String last = "";

		for ( int i=s.length()-1; i>=0; i-- ){
			if (s.charAt(i) == ' ' && last.isEmpty() == false)
				break;
			else if (s.charAt(i) != ' ')
				last = last + s.charAt(i);
			
		}

		return last.length();

	}
}
