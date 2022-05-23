package Array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3)));

	}
	/*
	 * Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 */

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		for (int i=m, k=0; i<nums1.length; i++, k++) {
			nums1[i]=nums2[k];
		}
		
		Arrays.sort(nums1);
		
		return nums1;
	}
}
