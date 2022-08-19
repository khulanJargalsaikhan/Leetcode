package HashTable;

import java.util.*;
/*
Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers,
return the list of integers that are present in each array of nums sorted in ascending order.
Example 1:
Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]
Explanation:
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4,
so we return [3,4].
 */
public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        System.out.println(intersection(new int[][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
        System.out.println(intersection(new int[][] {{7,34,45,10,12,27,13},{27,21,45,10,12,13}}));

    }

    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int row=0; row<nums.length; row++){
            for(int col=0; col<nums[row].length; col++){
                map.put(nums[row][col], map.getOrDefault(nums[row][col], 0) + 1 );
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == nums.length){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
