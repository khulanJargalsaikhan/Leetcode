package Array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		Solution.rotate(new int[] {1,2,3,4,5,6,7}, 3);
		Solution.rotate(new int[] {1,2,3,4,5,6,7}, 2);
		Solution.rotate(new int[] {1,2,3,4,5,6,7}, 1);

		Solution.rotate(new int[] {-1,-100,3,99}, 2);
		
		
		Solution2.rotate(new int[] {-1,-100,3,99}, 2);

		
		
	}

	
}

class Solution {
    public static void rotate(int[] nums, int k) {
        
        /*
         * Given an array, rotate the array to the right by k steps, where k is non-negative.
         * 
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        
        Input: nums = [-1,-100,3,99], k = 2
		Output: [3,99,-1,-100]
        */
    	
    	//my solution
    	int[] result = new int[nums.length];
    	int start = nums.length-k;

    	if (nums.length == k)
    		System.out.println(Arrays.toString(nums));
    	else {
    		for (int i=0; i<nums.length && start<nums.length; i++) {
    			result[i] = nums[start];
    			start++;
    			if (start >= nums.length) {
    				i++;
    				for (int j=0; j<nums.length-k; j++, i++) {
    					result[i] = nums[j];

    				}
    			}

    		}
    	} 
    	System.out.println(Arrays.toString(result));

    }
}


//better solution
class Solution2 {
	public static void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}
