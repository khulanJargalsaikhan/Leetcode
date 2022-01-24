package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4})));

	}
/*
 * Remove Duplicates from Sorted Array
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
 */
	public static int[] removeDuplicates(int[] nums) {
		
		//two pointers i and j, where i is the slow-runner while j is the fast-runner.
		int i = 0;
		for (int j=1; j<nums.length; j++) {
			
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		} 
		
		int[] newNums = new int[i+1];
		
		for (int k=0; k<i+1; k++) {
			newNums[k] = nums[k];
		}
		
		return newNums;
	}

}
