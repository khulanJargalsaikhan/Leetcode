package Array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {3,0,1}));
		System.out.println(missingNumber(new int[] {0,1}));
		System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));

		System.out.println(missingNumber2(new int[] {3,0,1}));
		System.out.println(missingNumber2(new int[] {0,1}));
		System.out.println(missingNumber2(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	/*
	 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range 
	 * that is missing from the array.
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number 
in the range since it does not appear in nums.
	 */

	//O(n) time and space
	public static int missingNumber(int[] nums) {
		
		Set<Integer> myset = new HashSet<>();
		
		for (Integer num : nums)
			myset.add(num);
		
		for (int i=0; i<=nums.length; i++) {
			if (!myset.contains(i))
				return i;
		}
		
		return -1;
	}
	
	
	//O(1) space and O(n) runtime complexity
	//1+2+...+n = n*(n+1)/2,
	public static int missingNumber2(int[] nums) {
		
		int n = nums.length;
		int sum = 0;
		for(Integer num : nums){
			sum += num;
		}
		
		return n*(n+1)/2 - sum;
	}
	
	
	
	

}