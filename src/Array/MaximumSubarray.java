package Array;

public class MaximumSubarray {
	/*
Given an integer array nums, find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
	 */
	

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

	}

	// solution using kadane's algorithm  O(n)
	public static int maxSubArray(int[] nums) {

		int max = nums[0];
		int sum = max;

		for (int i=1; i<nums.length; i++) {
			sum = Math.max(nums[i], nums[i] + sum);
			max = Math.max(max, sum);
		}

		return max;
	}
}
