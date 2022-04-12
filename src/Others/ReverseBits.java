package Others;

public class ReverseBits {

	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(reverseBits(0b00000010100101000001111010011100)));
	}
	/*
Reverse bits of a given 32 bits unsigned integer.
Note:
Note that in some languages, such as Java, there is no unsigned integer type. 
In this case, both input and output will be given as a signed integer type. 
They should not affect your implementation, as the integer's internal 
binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. 
Therefore, in Example 2 above, the input represents the signed integer -3 and 
the output represents the signed integer -1073741825.

Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 
represents the unsigned integer 43261596, so return 964176192 which its binary 
representation is 00111001011110000010100101000000.
	 */

	 public static int reverseBits(int n) {
	        
		 int result = 0;
		 for (int i=0; i<32; i++){
			 //give room for the first bit in result
			 result = result << 1; 
			 //get the first bit
			 int firstBit = n & 1;    // firstBit = n % 2;
			 //add the bit value to result
			 result = result + firstBit;   //result = result | firstBit
			 //remove the first bit in n
			 n = n >> 1;    // n = n / 2;
		 }
		 return result;
	        
		 
	    }
	
}
