package HashTable;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args){
        System.out.println(countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
    }
/*
ou are given a string allowed consisting of distinct characters and an array of strings words.
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.
Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean isConsistent = true;
        //26 possible character, all chars in allowed will be set to true
        boolean[] saveAllowedByChar = new boolean[26];
        for(char letter : allowed.toCharArray()){
            //decimal value for a is 97
            saveAllowedByChar[letter - 97] = true;  //saveAllowedByChar[0] = true
        }

        //checking every word in words
        for(String word : words){
                //checking every char in a word
            for( char letter : word.toCharArray()){
                if (saveAllowedByChar[letter - 97] == false) {
                    isConsistent = false;
                    break;
                } else {
                    isConsistent = true;
                }
            }
            if (isConsistent){
                count++;
            }

        }
        return count;
    }



}
