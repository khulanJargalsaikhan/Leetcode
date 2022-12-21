package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfPairs(new int[]{1,3,2,1,3,2,2})));
    }

    //brute force solution - used HashMap
    public static int[] numberOfPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int ans0 = 0;
        int ans1 = 0;
        int[] ans = new int[2];
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (int i : map.keySet()){
            if (map.get(i) % 2 == 0){
                ans0 += map.get(i)/2;
            }
            else {
                ans0 += (map.get(i)-1)/2;
                ans1++;
            }
        }
        ans[0] = ans0;
        ans[1] = ans1;

        return ans;
    }
}
