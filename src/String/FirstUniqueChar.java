package String;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("aabb"));
	}
	/*
	 * Given a string s, find the first non-repeating character in it and 
	 * return its index. If it does not exist, return -1.

	Input: s = "leetcode"
	Output: 0

	Input: s = "loveleetcode"
	Output: 2

	Input: s = "aabb"
	Output: -1
	 */

	public static int firstUniqChar(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		// building map (key=char, value=num of times char appears)
		for (int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
		}
		
		//searching value equal to 1
		for (int i=0; i<map.size(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		
		return -1;
	}
}
