package Array;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[] {4,2,5,7})));  //[4,5,2,7]
        System.out.println(Arrays.toString(sortArrayByParityII2(new int[] {4,2,5,7})));  //[4,5,2,7]
        System.out.println(Arrays.toString(sortArrayByParityII2(new int[] {888,505,627,846})));  //[888,505,846,627]

    }
    /*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
     */

    public static int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        int i = 0;
        for (int n: nums) if (n % 2 == 0) {
            ans[i] = n;
            i += 2;
        }

        i = 1;
        for (int n: nums) if (n % 2 == 1) {
            ans[i] = n;
            i += 2;
        }

        return ans;
    }

    //solution #2 : sort them in place
    public static int[] sortArrayByParityII2(int[] nums) {
        //put all even elements in the correct place, since all odd elements
        //will be in the correct place too. So let's only focus on A[0], A[2], A[4], ...
        int j=1;
        for (int i=0; i<nums.length; i+=2){
            if (nums[i] % 2 == 1) {
                //if odd elements in the correct place, then go and check the next one
                while (nums[j] % 2 == 1)
                    j+=2;

                //swap here
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }

}
