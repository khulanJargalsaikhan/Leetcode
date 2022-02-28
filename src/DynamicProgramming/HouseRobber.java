package DynamicProgramming;

public class HouseRobber {

	public static void main(String[] args) {
		System.out.println(rob(new int[] {1,2,3,1}));
		System.out.println(rob(new int[] {10,2,3,100}));

	}
	/*
	 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
	 * the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected 
	 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money 
you can rob tonight without alerting the police.

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
	 */


	public static int rob(int[] nums) {
		//if zero house, there is no money to rob
		if(nums.length == 0)
			return 0;
		//if there is one house, then just rob that house
		if (nums.length == 1)
			return nums[0];
		// if there are 2 houses to rob, choose the one where more money in
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		int[] dp = new int[nums.length];
		//if there is only one house
		dp[0] = nums[0];
		//if there are 2 houses
		dp[1] = Math.max(nums[0], nums[1]);

		//if there are more than 2 houses
		for (int i=2; i<nums.length; i++){
			dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
		}

		return dp[nums.length-1];

	}

}
