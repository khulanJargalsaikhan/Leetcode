package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
    /*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
     */

    //Solution 1: Brute Force O(n^3)
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                for (int k = j+1; k<nums.length; k++){
                    List<Integer> innerList = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0){
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);
                        Collections.sort(innerList);
                        result.add(innerList);
                    }
                }
            }
        }
        result = new ArrayList < List < Integer >> (new LinkedHashSet < List < Integer >> (result));
        return result;
    }
}
