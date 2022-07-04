package HashTable;

import java.util.*;

public class RingsandRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));   //1
        System.out.println(countPoints("B0R0G0R9R0B0G0"));  //1
        System.out.println(countPoints("G4"));  //0

    }

    /*
    There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
    You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters
    in rings forms a color-position pair that is used to describe each ring where:
    The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
    The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').

    Return the number of rods that have all three colors of rings on them.

    Input: rings = "B0B6G0R6R0R6G9"
    Output: 1
    Explanation:
    - The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
    - The rod labeled 6 holds 3 rings, but it only has red and blue.
    - The rod labeled 9 holds only a green ring.
    Thus, the number of rods with all three colors is 1.
     */
    public static int countPoints(String rings) {
        int count = 0;

        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i++) {
            //check only odd index
            if (i % 2 == 1){
                // if the Character in that index is not set as a Key in the map,
                // then put it into map as a Key, and instantiate new Set as a Value
                if(!map.containsKey(rings.charAt(i))){
                    map.put(rings.charAt(i), new HashSet<>());
                }
                // now we add the value that indexed right before the key index -> to the map
                map.get(rings.charAt(i)).add(rings.charAt(i-1));
            }
        }

        //loop through only values
        for (Set<Character> set : map.values()){
            // values in set is always unique, so that we check the size of the values
            if (set.size() == 3){
                count++;
            }
        }

        return count;
    }

}