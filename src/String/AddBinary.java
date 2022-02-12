package String;

public class AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));

	}
	/*
Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"

Binary addition
	        0+0=0
	        0+1=1
	        1+1=10
	        1+1+1=11
	 */
	public static String addBinary(String a, String b) {

		int i = a.length()-1;
		int j = b.length()-1;
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		
		while (i>=0 || j>=0) {
			// if carry has 1 then it will be added to sum
			int sum = carry;
			if (i>=0) 
				//making char to int
				sum = sum + a.charAt(i) - '0';
			if (j>=0) 
				//making char to int
				sum = sum + b.charAt(j) - '0';
			//this carries the 1
			carry = sum > 1 ? 1 : 0;
			sb.append(sum%2);
			i--;
			j--;
		}
		//make sure if carry has 1, then we need append it
		if (carry != 0)
			sb.append(carry);
		
		return sb.reverse().toString();		
		
	}
}
