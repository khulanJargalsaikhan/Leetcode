package DynamicProgramming;

public class MaximumSubarray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})); //6
		System.out.println(maxSubArray(new int[] {1})); //1
		System.out.println(maxSubArray(new int[] {5,4,-1,7,8})); //23

	}
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
	 * which has the largest sum and return its sum.
	A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
	 */

	 public static int maxSubArray(int[] nums) {
		 // if nums is empty
		 if (nums.length == 0)
			 return 0;
		 // if nums has 1 element
		 if (nums.length == 1)
			 return nums[0];
		 
		 // if nums has more than 2 elements
		 int sum = nums[0];
		 // max is first element
		 int max = sum;
		 for (int i=1; i<nums.length; i++) {
			 // checking sum of both elements greater than second element or second element is greater than sum of both
			 sum = Math.max(sum+nums[i], nums[i]);
			 // checking first element (max) is greater than sum
			 max = Math.max(max, sum);
		 }
		 
		 return max;
		 
	 }
}
