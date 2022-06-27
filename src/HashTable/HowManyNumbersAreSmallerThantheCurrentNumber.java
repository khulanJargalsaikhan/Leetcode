package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] arg){
        //System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(new int[] {8,1,2,2,3})));
    }
    /*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
     */

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;

        while(j<nums.length){
            int count = 0;

            for (int i=0; i<nums.length; i++){
                if (j==i && i<nums.length-1) i++;
                if (nums[j] > nums[i]){
                    count++;
                }
            }

            result[j] = count;
            j++;
        }
        return result;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();

        //keep the original array for key of the map
        int[] original = nums.clone();

        //sort the array
        Arrays.sort(nums);

        //use sorted array for value of the map
        for (int i=0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }

        //get the values (index numbers) associated with key (original array)
        for (int i=0; i<nums.length; i++){
            result[i] = map.get(original[i]);
        }
        return result;
    }
}


