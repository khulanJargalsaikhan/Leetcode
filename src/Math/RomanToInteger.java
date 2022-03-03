package Math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("III")); //3
		System.out.println(romanToInt("LVIII")); //58    L = 50, V= 5, III = 3.
		System.out.println(romanToInt("MCMXCIV"));  //1994   M = 1000, CM = 900, XC = 90 and IV = 4.

	}

	/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

	 */


	public static int romanToInt(String s) {

		int sum = 0;
		Map<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		//loop through from left to right
		for (int i=0; i<s.length(); i++){
			/*Roman numerals are written largest to smallest from left to right. 
			However, the numeral for four is not IIII. Instead, the number four is written as IV. 
			Because the one is before the five we subtract it making four. V-I=IV */
			
			//if s.charAt(i) is less than s.charAt(i+1), then we need to subtract it, then add it to the sum. 
			if ( i != s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)) ){
				sum = sum + ( map.get(s.charAt(i+1)) - map.get(s.charAt(i)) );
				i++; // we checked next element also
			}else {
				//if s.charAt(i) is greater than s.charAt(i+1), then we just add it to the sum.
				sum = sum + map.get(s.charAt(i));
			}
		}
		return sum;


	}

}
