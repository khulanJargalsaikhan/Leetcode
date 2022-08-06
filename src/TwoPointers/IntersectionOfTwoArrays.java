package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1}, new int[] {2,2})));
        System.out.println(Arrays.toString(intersection(new int[] {4,5,9}, new int[] {9,4,9,8,4})));

    }
    //brute force approach
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            for (int j=0; j< nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = new int[set.size()];
        int i=0;
        for (int num : set){
            result[i++] = num;
        }
        return result;
    }
}
