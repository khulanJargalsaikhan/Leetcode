package TwoPointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args){
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
        System.out.println(threeSum2(new int[] {-1,0,1,2,-1,-4}));
        System.out.println(threeSum2(new int[] {-2,0,1,1,2}));
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



    //Solution 2: O(n^2) using 3 pointer
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //sort first
        for(int p1=0; p1<nums.length-2; p1++){
            // Skip all duplicates from left
            // -1, -1, 0, 1, 1, 1, 2, 2
            if (p1 > 0 && nums[p1-1] == nums[p1]){
                continue;
            }
            int p2=p1+1;
            int p3= nums.length-1;
            while (p2<p3){
                int sum = nums[p1] + nums[p2] + nums[p3];
                if (sum == 0){
                    result.add(Arrays.asList(nums[p1], nums[p2], nums[p3]));
                    // Skip all duplicates from inner left
                    while (p2<p3 && nums[p2] == nums[p2+1]){
                        p2++;
                    }
                    // Skip all duplicates from right
                    while (p2<p3 && nums[p3-1] == nums[p3]){
                        p3--;
                    }
                    p2++;
                    p3--;

                } else if (sum < 0){
                    p2++;
                } else {
                    p3--;
                }
            }
        }
        return result;
    }
}
