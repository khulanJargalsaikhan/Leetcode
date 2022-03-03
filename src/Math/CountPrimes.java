package Math;

public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimes(0)); //0
		System.out.println(countPrimes(1)); //1
		System.out.println(countPrimes(10)); //4

	}
	/*
	 * Given an integer n, return the number of prime numbers that are strictly less than n.
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	 */

	// Sieve of Eratosthenes is one of the most efficient ways to find all prime numbers up to n
	// time: O(n log log n) - space: O(n) 
	public static int countPrimes(int n) {
		   boolean[] isPrime = new boolean[n];
		   for (int i = 2; i < n; i++) {
		      isPrime[i] = true;
		   }
		   
		   //Let's look at the first number, 2. We know all multiples of 2 must not be primes, 
		   //so we mark them off as non-primes. Then we look at the next number, 3. 
		   //Similarly, all multiples of 3 such as 3 × 2 = 6, 3 × 3 = 9, ... must not be primes, 
		   //so we mark them off as well. Now we look at the next number, 4, which was already marked off. 
		   //so 4 is not a prime because it is divisible by 2, which means all multiples of 4 must also be divisible 
		   //by 2 and were already marked off. So we can skip 4 immediately and 
		   //go to the next number, 5. Now, all multiples of 5 such as 5 × 2 = 10, 5 × 3 = 15, 5 × 4 = 20, 5 × 5 = 25, 
		   //... can be marked off. There is a slight optimization here, we do not need to start from 5 × 2 = 10. 
		   //because 5 × 2 = 10 was already marked off by multiple of 2, similarly 5 × 3 = 15 was already marked off by multiple of 3, 
		   //we can mark off multiples of 5 starting at 5 × 5 = 25,  
		   // Therefore, if the current number is p, 
		   //we can always mark off multiples of i starting at i^2, then in increments of i.
		   
		   for (int i = 2; i * i < n; i++) {   // loop stop condition: i < root of n (ex:3 < 3.16)   n=10, root of 10=3.16;
			   if (isPrime[i] == false) // if it is false, that means it is already marked off. 
				   continue;
			   for (int j = i * i; j < n; j += i) {
				   isPrime[j] = false;
			   }
		   }
		   int count = 0;
		   //counting all trues
		   for (int i = 2; i < n; i++) {
		      if (isPrime[i]) 
		    	  count++;
		   }
		   return count;
		}
}


