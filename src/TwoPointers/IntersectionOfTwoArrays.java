package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1}, new int[] {2,2}))); //[2]
        System.out.println(Arrays.toString(intersection(new int[] {4,5,9}, new int[] {9,4,9,8,4}))); //[4,9]

        System.out.println(Arrays.toString(intersection2(new int[] {1,2,2,1}, new int[] {2,2}))); //[2]
        System.out.println(Arrays.toString(intersection2(new int[] {4,5,9}, new int[] {9,4,9,8,4}))); //[4,9]

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

/*
Complexity Analysis
Time complexity : O(n+m) in the average case and O(n*m) in the worst case when load factor is high enough.
Space complexity : O(n+m) in the worst case when all elements in the arrays are different.
*/
    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //converting nums1, nums2 arrays to set1 and set2
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        //set1 keeps only matching elements of set2
        set1.retainAll(set2);
        //copy set1 to result array
        int[] result = new int[set1.size()];
        int i = 0;
        for (Integer num : set1) result[i++] = num;

        return result;
    }
}
