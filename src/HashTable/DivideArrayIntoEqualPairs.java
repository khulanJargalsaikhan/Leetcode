package HashTable;

import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args){
        System.out.println(divideArray(new int[] {3,2,3,2,2,2}));
        System.out.println(divideArray(new int[] {1,2,3,4}));

    }

//Leetcode problem #2206
    public static boolean divideArray(int[] nums) {
        //For any number x in the range [1, 500],
        //count the number of elements in nums whose values are equal to x.
        int[] pool = new int[501];
        for (int i=0; i<nums.length; i++){
            pool[nums[i]]++;
        }
        //The elements with equal value can be divided completely
        //into pairs if and only if their count is even.
        System.out.println(Arrays.toString(pool));
        for (int num : pool){
            if (num % 2 != 0){
                return false;
            }
        }
        return true;

    }

}
