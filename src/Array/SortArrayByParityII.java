package Array;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[] {4,2,5,7})));  //[4,5,2,7]
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
}
