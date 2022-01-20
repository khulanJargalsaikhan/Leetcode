package String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));

	}
	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	typically using all the original letters exactly once.

	Input: s = "anagram", t = "nagaram"
	Output: true

	Input: s = "rat", t = "car"
	Output: false
	 */

	public static boolean isAnagram(String s, String t) {

		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		
		// building map for string s (key=char, value=num of times char appears)
		for (int i=0; i<s.length(); i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		// building map for string t (key=char, value=num of times char appears)
		for (int i=0; i<t.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		// comparing two maps
		if (sMap.equals(tMap))
			return true;
		
		return false;
		
	}


}
