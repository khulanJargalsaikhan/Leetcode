package Array;

public class SearchInsertPosition {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));

	}

	/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
	 */

	// using binary search O(log n)
	public static int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length-1;
		int mid = 0;

		while (low <= high){
			mid = low + (high - low) / 2;

			if (nums[mid] == target)
				return mid;
			else if (target < nums[mid])
				high = mid-1;
			else if (target > nums[mid])
				low = mid+1;
		}

		return low;


	}
}