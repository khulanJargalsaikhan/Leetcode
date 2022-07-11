package HashTable;

public class SumofUniqueElements {
    /*
You are given an integer array nums. The unique elements of an array are the elements
that appear exactly once in the array. Return the sum of all the unique elements of nums.

Example 1:
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
     */
    public static void main(String[] args){
        System.out.println(sumOfUnique(new int[] {1,2,3,2}));    //4
        System.out.println(sumOfUnique(new int[] {1,1,1,1,1}));  //0
        System.out.println(sumOfUnique(new int[] {1,2,3,4,5}));  //15
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        //Creating a dictionary to count the frequency of each number.
        int[] pool = new int[101];
        for (int i=0; i<nums.length; i++){
            pool[nums[i]]++;
        }

        for (int i=0; i<pool.length; i++){
            //checking what number appears only once
            if (pool[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}
