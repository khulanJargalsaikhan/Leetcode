package HashTable;

import java.util.HashMap;
import java.util.Map;
/*
You are given a non-negative integer array nums. In one operation, you must:
    Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
    Subtract x from every positive element in nums.
    Return the minimum number of operations to make every element in nums equal to 0.
Example 1:
Input: nums = [1,5,0,3,5]
Output: 3
Explanation:
In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
 */
public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[] {1,5,0,3,5})); //3
        System.out.println(minimumOperations(new int[] {0})); //0
    }

    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //Elements with the same value will always take the same number of operations to become 0.
        //Contrarily, elements with different values will always take a different number of operations to become 0.
        for(int num : nums){
            if (num != 0){
                map.put(num, map.getOrDefault(num, 1)+1);
            }
        }
        //The answer is the number of unique non-zero numbers in nums.
        return map.size();
    }

}
