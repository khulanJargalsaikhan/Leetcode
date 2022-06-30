package HashTable;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofPairsWithAbsoluteDifferenceK {
    public static void main(String[] args){
        System.out.println(countKDifference(new int[] {1,2,2,1}, 1));
        System.out.println(countKDifference(new int[] {3,2,1,5,4}, 2));

        System.out.println(countKDifference2(new int[] {1,2,2,1}, 1));
        System.out.println(countKDifference2(new int[] {3,2,1,5,4}, 2));
    }

/*
Given an integer array nums and an integer k, return the number of pairs (i, j)
where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
Example 1:
Input: nums = [1,2,2,1], k = 1
Output: 4
 */
    //brute force
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] - nums[j] == k || nums[j] - nums[i] == k){
                    count++;
                }
            }
        }
        return count;
    }


    public static int countKDifference2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums){
           /* |nums[i] - nums[j]| = k
                    => nums[i] - nums[j] = k or nums[i] - nums[j] = -k
                    => nums[i] = nums[j] + k or nums[i] = nums[j] - k    */

            //if num-k is in the map as key, then get the value. Otherwise 0
            count = count + map.getOrDefault(num-k, 0) + map.getOrDefault(num+k,0);
            //if map has num value then, add 1 to the value. Otherwise set num as key, 1 as value
            map.compute(num, (n,v)->v == null ? 1 : v+1);
        }
        return count;
    }
}
