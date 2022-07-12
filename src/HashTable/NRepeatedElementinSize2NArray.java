package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElementinSize2NArray {
    /*
    Leetcode #961
You are given an integer array nums with the following properties:
nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

Example 1:
Input: nums = [1,2,3,3]
Output: 3
     */
    public static void main(String[] args){
        System.out.println(repeatedNTimes(new int[] {1,2,3,3})); //3
        System.out.println(repeatedNTimes(new int[] {2,6,2,1})); //2

        System.out.println(repeatedNTimes2(new int[] {1,2,3,3}));
        System.out.println(repeatedNTimes2(new int[] {5,1,5,2,5,3,5,4})); //5

    }
    public static int repeatedNTimes(int[] nums) {
        int result = 0;
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
//            if (map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i])+1);
//            }else {
//                map.put(nums[i], 1);
//            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        System.out.println(map);

        for (Integer key : map.keySet()){
            if (map.get(key) > 1){
                result = key;
            }
        }

        return result;


    }


    public static int repeatedNTimes2(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        throw null;

    }
}
