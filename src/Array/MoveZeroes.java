package Array;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(moveZeroes2(new int[] {0,1,0,3,12})));
		System.out.println(Arrays.toString(moveZeroes(new int[] {0,0})));
	}

	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order 
	 * of the non-zero elements. Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

	 */

	// my solution
	public static int[] moveZeroes(int[] nums) {

		int len = nums.length;	

		if (len <= 1) return nums;
		
		//start looping from the last element
		for (int i=len-2; i>=0; i--){
			
			// the element equal to zero, swap that element with next non-zero element
			if (i < len && nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp;
				
				// after first swap, if there is a non-zero element right next to it, swap again until 
				// it reaches the zero element on the right
				for (int j=i+1; j<len-1; j++) {
					if(nums[j] == 0) {
						temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
				}

			}
		}
		return nums;
	}

	
	
	
	//medium.com solution
	public static int[] moveZeroes2(int[] nums) {

		if(nums == null || nums.length == 0)
			return nums;

		int i=0;
		int j=0;
		
		// Step 1: Fill nums array with non-zero's 
		while(i<nums.length)
		{
			if(nums[i]!=0){
				nums[j]=nums[i];
				j++;
				i++;
			}
			else
				i++;
		}
		
		// Step 2: Append 0's to the end of array after Step 1
		while(j<nums.length)
		{
			//filling the remaining slots of array with zero's
			nums[j]=0;
			j++;
		}
		
		return nums;

	}



}
