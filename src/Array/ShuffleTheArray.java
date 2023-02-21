package Array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7}, 3))); //[2,3,5,4,1,7]
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0, j = n; i < n; i++, j++){
            result[index] = nums[i];
            result[++index] = nums[j];
            index++;
        }
        return result;
    }
}
