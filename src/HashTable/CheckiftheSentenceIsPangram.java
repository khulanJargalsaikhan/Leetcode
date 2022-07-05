package HashTable;

import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args){
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));  //true
        System.out.println(checkIfPangram("leetcode"));  //false
    }
/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
    public static boolean checkIfPangram(String sentence) {
        //will use set ds in order to maintain 26 different characters
        Set<Character> set = new HashSet<>();
        for (int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        //if size of the set is equal to 26, that means it is pangram
        if (set.size() == 26){
            return true;
        }
        return false;
    }
}
