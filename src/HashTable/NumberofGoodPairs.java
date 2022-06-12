package HashTable;

import java.util.Arrays;

public class NumberofGoodPairs {

    public static void main(String[] arg){
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs(new int[] {1,1,1,1}));

        System.out.println(numIdenticalPairs2(new int[] {1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs2(new int[] {1,1,1,1}));
    }

    /*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
     */

    //O(n^2)
    public static int numIdenticalPairs(int[] nums) {
        int n = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    n++;
                }
            }
        }
        return n;
    }

    //O(n log n)
    public static int numIdenticalPairs2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int j= 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == nums[j]) {
                count += i-j;
            }
            else {
                j = i;
            }
        }
        return count;
    }



}
