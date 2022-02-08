package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println(majorityElement4(new int[] {2,2,1,1,1,2,2})); // 2
		System.out.println(majorityElement4(new int[] {3,3,4}));     //3
		System.out.println(majorityElement4(new int[] {6,6,6,7,7}));  //6
		System.out.println(majorityElement4(new int[] {1}));  //1
		System.out.println(majorityElement4(new int[] {1,2,3,4,5,6}));  //1

	}
	/*
	 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than n / 2 times. 
You may assume that the majority element always exists in the array.
Input: nums = [2,2,1,1,1,2,2]
Output: 2

	 */
	// O(n^2) my solution
	public static int majorityElement(int[] nums) {

		int max = 0;
		int count = 0;
		int majority = 0;

		if (nums.length == 1)
			return nums[0];

		for (int i=0; i<nums.length; i++){
			for (int j=i+1; j<nums.length; j++){
				if (nums[i] == nums[j]){
					count++;
				}
			}
			if (count > max){
				max = count;
				majority = nums[i];
				count = 0;
			}
			count = 0;
		}

		return majority;
	}

	// O(n)  Boyer-Moore voting algorithm
	public static int majorityElement2(int[] nums) {

		int majority = nums[0];
		int count = 1;
		for(int i=1; i<nums.length;i++){
			if(count == 0){
				majority = nums[i];
			}
			if(majority != nums[i]){
				count--;
			}else 
				count++;

		}
		return majority;
	}
	
	// O(n log n)
	public static int majorityElement3(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	// using hashmap
	public static int majorityElement4(int[] nums) {
		
		int majority = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num)+1);
			}
			
			// if a value of key(num) greater than half of length of array, then majority is found 
			if (map.get(num) > nums.length/2) {
				majority = num;
				break;
			}
		}
		
		return majority;
		
	}
	
	
}
