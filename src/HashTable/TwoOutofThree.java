package HashTable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoOutofThree {
    /* Leetcode #2032
Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values
that are present in at least two out of the three arrays. You may return the values in any order.
Example 1:
Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
     */
    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[] {1,1,3,2}, new int[] {2,3}, new int[] {3})); //[3,2]
        System.out.println(twoOutOfThree(new int[] {3,1}, new int[] {2,3}, new int[] {1,2}));    //[2,3,1]
        System.out.println(twoOutOfThree(new int[] {1,2,2}, new int[] {4,3,3}, new int[] {5}));  //[]

        System.out.println(twoOutOfThree2(new int[] {1,1,3,2}, new int[] {2,3}, new int[] {3})); //[3,2]
        System.out.println(twoOutOfThree2(new int[] {3,1}, new int[] {2,3}, new int[] {1,2}));    //[2,3,1]
        System.out.println(twoOutOfThree2(new int[] {1,2,2}, new int[] {4,3,3}, new int[] {5}));  //[]

        System.out.println(twoOutOfThree3(new int[] {1,1,3,2}, new int[] {2,3}, new int[] {3})); //[3,2]
        System.out.println(twoOutOfThree3(new int[] {3,1}, new int[] {2,3}, new int[] {1,2}));    //[2,3,1]
        System.out.println(twoOutOfThree3(new int[] {1,2,2}, new int[] {4,3,3}, new int[] {5}));  //[]
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums1){
            if (IntStream.of(nums2).anyMatch(x -> x == num) || IntStream.of(nums3).anyMatch(x -> x == num)){
                list.add(num);
            }
        }
        for(int num : nums2){
            if (IntStream.of(nums3).anyMatch(x -> x == num)){
                list.add(num);
            }
        }
        return list.stream().distinct().collect(Collectors.toList());
    }

    //better solution
    public static List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>(), set = new HashSet<>();
        for (int num : nums1){
            set1.add(num);
            set.add(num);
        }
        for (int num : nums2){
            set2.add(num);
            set.add(num);
        }
        for (int num : nums3){
            set3.add(num);
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : set){
            if (set1.contains(num) && set2.contains(num) || set2.contains(num) && set3.contains(num) || set1.contains(num) && set3.contains(num)){
                list.add(num);
            }
        }
        return list;
    }

    public static List<Integer> twoOutOfThree3(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        //loop through nums1 and save all unique digits as a key and count the frequency of the digits
        for(int i : nums1)
            if(!map.containsKey(i))
                map.put(i,1);
        //loop through nums2, if digits not in the map, then put them into the map also into the set
        //so that, we will not count the duplicates of digits from same array.
        for(int i : nums2) {
            if(!map.containsKey(i)) {
                map.put(i,1);
                set.add(i);
            } else {
                //if a digit is in the map, but not in the set, then we put it into the map and increase frequency by 1
                if(!set.contains(i))
                    map.put(i,2);
            }
        }
        //for the 3rd array, we only care about the digits already in the map
        //because we are looking for digits that exit in two out of three arrays.
        for(int i : nums3)
            if(map.containsKey(i))
                map.put(i,map.getOrDefault(i,0)+1);
        //get the values that is greater than 1, and put them into the list
        for(Integer key : map.keySet())
            if(map.get(key)>1)
                list.add(key);

        return list;
    }

}
