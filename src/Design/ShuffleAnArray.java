package Design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray {

	public static void main(String[] args) {
		Solution solution = new Solution(new int[] {1, 2, 3});
		System.out.println("shuffling...");
		System.out.println(Arrays.toString(solution.shuffle()));
		System.out.println("resetting...");
		System.out.println(Arrays.toString(solution.reset()));
		System.out.println("shuffling...");
		System.out.println(Arrays.toString(solution.shuffle()));
		
//		int[] nums = new int[] {1,2,3};
//		Solution obj = new Solution(nums);
//		int[] param_1 = obj.reset();
//		System.out.println(Arrays.toString(param_1));
//		int[] param_2 = obj.shuffle();
//		System.out.println(Arrays.toString(param_2));
		 

	}
	/*
	 * Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array 
	 * should be equally likely as a result of the shuffling.
	 * 
Implement the Solution class:
Solution(int[] nums) Initializes the object with the integer array nums.
int[] reset() Resets the array to its original configuration and returns it.
int[] shuffle() Returns a random shuffling of the array.
 

Example 1:
Input
["Solution", "shuffle", "reset", "shuffle"]
[[[1, 2, 3]], [], [], []]
Output
[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
                       // Any permutation of [1,2,3] must be equally likely to be returned.
                       // Example: return [3, 1, 2]
solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
solution.shuffle();    // Returns the random shuffling of array [1,2,3]. Example: return [1, 3, 2]
	 */
	
	// time: O(n^2) - space: O(n)
	static class Solution {
		
		private int[] array;
		private int[] original;
		private Random rand = new Random();
		
		// create a list from copying the array in order to shuffle
		private List<Integer> listArrayCopy(){
			List<Integer> asList = new ArrayList<>();
			for (int i=0; i<array.length; i++) {
				asList.add(array[i]);
			}
			return asList;
		}

		// constructor
	    public Solution(int[] nums) {
	    	array = nums;
	    	original = nums.clone();
	    }
	    
	    public int[] reset() {
	    	//just store the original state of nums on construction
	        array = original;
	        original = original.clone();
	        return array;
	    }
	    
	    public int[] shuffle() {
	        List<Integer> aux = listArrayCopy();
	        
	        for (int i=0; i<array.length; i++) {
	        	//randomly selected index number
	        	int selected = rand.nextInt(aux.size());
	        	
	 	        //System.out.println(selected);
	        	
	 	        // populating the array with random numbers
	 	        array[i] = aux.get(selected);
	 	        
	 	        //it is removed from aux to prevent duplicate draws
	 	        aux.remove(selected);
	 	        
	 	        //System.out.println(aux);
	        }
	       
	        return array;
	    }
	}
}
