package HashTable;

import java.util.*;
/*
Leetcode #2053
A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.
Example 1:
Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned.
 */
public class KthDistinctStringInanArray {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[] {"d","b","c","b","c","a"}, 2));  //a
        System.out.println(kthDistinct(new String[] {"aaa","aa","a"}, 1));   //aaa
        System.out.println(kthDistinct(new String[] {"a","b","a"}, 3));   //""

        System.out.println(kthDistinct2(new String[] {"d","b","c","b","c","a"}, 2));  //a
        System.out.println(kthDistinct2(new String[] {"aaa","aa","a"}, 1));   //aaa
        System.out.println(kthDistinct2(new String[] {"a","b","a"}, 3));   //""
    }

    public static String kthDistinct(String[] arr, int k) {
        //create map and save input string as keys, frequency of the string as values
        //LinkedHashMap maintains order of input
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        //look for unique string and copy them into list
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        //check if k-1 index of list exist, if so return the value
        if (list.size() >= k){
            return list.get(k-1);
        } else {
            return "";
        }

    }

    //faster solution
    public static String kthDistinct2(String[] arr, int k) {
        //create map and save input string as keys, frequency of the string as values
        Map<String, Integer> map = new HashMap<>();
        //filter the arr and copy only unique str into the map
        Arrays.stream(arr).forEach(x -> map.put(x, map.getOrDefault(x, 0)+1));
        //loop through input arr, and if str from array as map key matches with map value, then reduce k by 1
        for (String str : arr){
            if (map.get(str) == 1 && --k == 0){
                return str;
            }
        }
        return "";
    }

}
