package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {


		System.out.println(Arrays.toString(twoSum(new int[] {5, 3, 5, 7}, 10)));
		System.out.println(Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));
		System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));

		//		List<String> words = new ArrayList<String>(Arrays.asList("Hello", "World"));
		//		words.remove("Hello");
		//		System.out.println(words);

		System.out.println("Using HashMap and two loop");
		
		System.out.println(Arrays.toString(twoSum2(new int[] {5, 3, 5, 7}, 10))); //0,2  1,3
		System.out.println(Arrays.toString(twoSum2(new int[] {3, 2, 4}, 6)));  //1,2
		System.out.println(Arrays.toString(twoSum2(new int[] {2, 7, 11, 15}, 9)));  //0,1

		System.out.println("Using HashMap and one loop");

		System.out.println(Arrays.toString(twoSum3(new int[] {5, 3, 5, 7}, 10))); //0,2  1,3
		System.out.println(Arrays.toString(twoSum3(new int[] {3, 2, 4}, 6)));  //1,2
		System.out.println(Arrays.toString(twoSum3(new int[] {2, 7, 11, 15}, 9)));  //0,1

		System.out.println("Using two pointer");

		System.out.println(Arrays.toString(twoSum4(new int[] {5, 3, 5, 7}, 10))); //0,2  1,3
		System.out.println(Arrays.toString(twoSum4(new int[] {3, 2, 4}, 6)));  //1,2
		System.out.println(Arrays.toString(twoSum4(new int[] {2, 7, 11, 15}, 9)));  //0,1
	}

	public static int[] twoSum(int[] arr, int target) {

		/*
		 * Given an array of integers nums and an integer target, return indices of the two numbers such that 
		 * they add up to target. You may assume that each input would have exactly one solution, 
		 * and you may not use the same element twice. You can return the answer in any order.
		 * 
		Example 1:
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

		Example 2:
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		 */


		int[] result = new int[2];

		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {
				if(target == arr[i] + arr[j]) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}


	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> mymap = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			mymap.put(nums[i], i);
		}
		
		for (int i=0; i<nums.length; i++) {
			int res = target - nums[i];
			if (mymap.containsKey(res) && mymap.get(res) != i) {
				return new int[] {i, mymap.get(res)};
			}
		}
		return null;
	}

	public static int[] twoSum3(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> mymap = new HashMap<>();

		for (int i=0; i<nums.length; i++) {
			if (mymap.containsKey(target - nums[i])) {
				result[0] = mymap.get(target-nums[i]);
				result[1] = i;
			} else {
				mymap.put(nums[i], i);
			}
		}
		return result;
	}

	public static int[] twoSum4(int[] nums, int target) {

		//Arrays.sort(nums);
		int i = 0, j=nums.length-1;
		while (i < nums.length){
			if (nums[i] + nums[j] == target){
				return new int[] {i,j};
			} else if (nums[i] + nums[j] > target){
				j--;
			} else {
				i++;
			}
		}
		return null;
	}
}
