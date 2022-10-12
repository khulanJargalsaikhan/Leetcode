package HashTable;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3)); //2
        System.out.println(arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));  //2

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


}

