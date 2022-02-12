package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {


		System.out.println(containsDuplicate2(new int[] {1,2,3,1}));	//true
		System.out.println(containsDuplicate2(new int[] {1,2,3,4}));	//false
		System.out.println(containsDuplicate2(new int[] {1,1,1,3,3,4,3,2,4,2})); // true

	}
	/*
	 * Given an integer array nums, return true if any value appears at least twice in the array, 
	 * and return false if every element is distinct.
	 	Input: nums = [1,2,3,1]
		Output: true
		Input: nums = [1,2,3,4]
		Output: false
	 */
	public static boolean containsDuplicate(int[] nums) {
		for (int i=0; i<nums.length-1; i++){  
			for (int j=i+1; j<nums.length; j++) {
				if (nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}
	
	public static boolean containsDuplicate2(int[] nums) {
		Set<Integer> myset = new HashSet<>();
		
		for (int i=0; i<nums.length; i++){  
			if (!myset.contains(nums[i]))
				myset.add(nums[i]);
			else
				return true;
		}
		return false;
	}
}