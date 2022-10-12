package HashTable;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3)); //2
        System.out.println(arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));  //2

        System.out.println(arithmeticTriplets2(new int[] {0,1,4,6,7,10}, 3)); //2
        System.out.println(arithmeticTriplets2(new int[] {4,5,6,7,8,9}, 2));  //2

    }
    /*
You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.
     */
    //brute force
    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                for (int k=j+1; k< nums.length; k++){
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    //optimized solution
    public static int arithmeticTriplets2(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            //7-3=4 && 7-(3*2)=1   (7,4,1)
            if (set.contains(num-diff) && set.contains(num-(diff*2))){
                count++;
            }
            set.add(num);
        }
        return count;
    }


}

