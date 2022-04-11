package Others;

public class NumberOfOneBits {

	public static void main(String[] args) {
		//0b  -binary
		//0x  -hexadecimal
		System.out.println(hammingWeight(00000000000000000000000000001011)); //3
		System.out.println(hammingWeight(00000000000000000000000010000000)); //1
		System.out.println(hammingWeight(0b11111111111111111111111111111101)); //31
		

	}
	/*
	 * Write a function that takes an unsigned integer and returns the number of '1' bits 
	 * it has (also known as the Hamming weight).

Note:
Note that in some languages, such as Java, there is no unsigned integer type. In this case, 
the input will be given as a signed integer type. It should not affect your implementation, 
as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, 
in Example 3, the input represents the signed integer. -3.
	 */

	public static int hammingWeight(int n) {
		//return Integer.bitCount(n);

		int ones = 0;
		while(n!=0) {
			//ones = ones + (n & 1);
			if ((n & 1) == 1)
				ones++;
			n = n>>>1;
			/*
			 *  '>>' -uses the sign bit to fill the trailing positions.
			 *  ex: if the number is positive then 0 will be used to fill the trailing
			 *  positions adn if the number is negative then 1 will be used to fill the trailing positions
			 *  
			 *  '>>>' -don't use the sign bit to fill the trailing positions.
			 *  it always fills the trailing positions by 0s.
			 *  
			 */
		}
		return ones;
		
		
		
		
		
	}

	




	}
