package HashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba")); //true
        System.out.println(buddyStrings("ab", "ab"));  //false
        System.out.println(buddyStrings("aa", "aa"));  //true
        System.out.println(buddyStrings("abcaa", "abcbb")); //false
    }

    public static boolean buddyStrings(String s, String goal) {
        //If strings are unequal in lengths, they're not buddies
        if (s.length() != goal.length()) return false;

        //If strings are the same, they're buddies if it has duplicate chars which can be swapped
        if (s.equals(goal)){
            int [] count = new int[26];
            for (int i=0; i<s.length(); i++){
                count[s.charAt(i) - 'a']++;
            }
            for (int c : count){
                if (c > 1)
                    return true;
            }
        }

        //For all other cases, there should be exactly 2 different chars and they swap to be make the strings equal
        int first = -1, second = -1;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != goal.charAt(i)){
                if (first == -1)
                    first = i;
                else if (second == -1)
                    second = i;
                else
                    return false;
            }
        }
        return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
    }
}