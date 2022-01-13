package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2})));
		System.out.println(Arrays.toString(intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4})));


	}
	
	/*
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
	 * Each element in the result must appear as many times as it shows in both arrays and 
	 * you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
	 */

	public static int[] intersect(int[] nums1, int[] nums2) {
		
		List<Integer> arrList = new ArrayList<>();
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i=0;
		int j=0;
		
		while (i < nums1.length && j < nums2.length) {
			
			if (nums1[i] == nums2[j]) {
				arrList.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j])
				j++;
			else
				i++;	
		}

		return listToArray(arrList);

	}
	
	//helper method
	private static int[] listToArray(List<Integer> list) {
		int[] result = new int[list.size()];
		
		for(int i=0; i<result.length; i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
	
}
