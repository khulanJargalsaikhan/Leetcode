package HashTable;

import java.util.*;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {
    public static void main(String[] args){
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));

        System.out.println(areOccurrencesEqual2("abacbc"));
        System.out.println(areOccurrencesEqual2("aaabb"));
    }

//Leetcode problem #1941
    public static boolean areOccurrencesEqual(String s) {
        //Building a dictionary containing the frequency of each character appearing in s
        int[] pool = new int[26];
        for (int i=0; i<s.length(); i++){
            pool[s.charAt(i) - 'a']++;
        }
        //Check if all values in the dictionary are the same.
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<26; i++){
            if (pool[i] > 0){
                set.add(pool[i]);
            }
        }
        if (set.size() == 1){
            return true;
        } else
            return false;
    }

    public static boolean areOccurrencesEqual2(String s) {
        //Building a dictionary containing the frequency of each character appearing in s
       Map<Character, Integer> map = new HashMap<>();
       for (char c : s.toCharArray()){
           if(map.containsKey(c)){
               map.put(c, map.get(c)+1);
           }else {
               map.put(c, 1);
           }
       }
        //Check if all values in the dictionary are the same.
         /*
		Set<Integer> set = new HashSet<Integer>();
		for(Entry<Character, Integer> c : map.entrySet()) {
			set.add(c.getValue());
		}
        	return set.size() == 1;
        */

        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;

    }




}
