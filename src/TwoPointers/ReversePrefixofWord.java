package TwoPointers;

import java.util.Arrays;

/*
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends
at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts
at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.
Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 */
public class ReversePrefixofWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));  //dcbaefd
        System.out.println(reversePrefix("xyxzxe", 'z')); //zxyxxe
        System.out.println(reversePrefix("abcd", 'z')); //abcd

        System.out.println(reversePrefix2("abcdefd", 'd'));  //dcbaefd
        System.out.println(reversePrefix2("xyxzxe", 'z')); //zxyxxe
        System.out.println(reversePrefix2("abcd", 'z')); //abcd
    }
    //brute force approach
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == ch){
                for (int f=i; f>=0; f--){
                    sb.append(word.charAt(f));
                }
                for (int j=i+1; j<word.length(); j++)
                    sb.append(word.charAt(j));
                return sb.toString();
            }
        }
        return word;
    }

    //using two pointers approach
    public static String reversePrefix2(String word, char ch) {
        char[] charArr = word.toCharArray();
        int pointer1 = 0;
        int pointer2 = 0;
        //finding index of ch which will be pointer2
        while (pointer2 < charArr.length){
            if (charArr[pointer2] == ch){
                break;
            }
            pointer2++;
        }
        //if pointer2 equal to charArr.length, that means ch does not exist in the word
        if (pointer2 == charArr.length)
            return word;

        //swapping characters in the charArr
        while (pointer1 < pointer2){
            char temp = charArr[pointer1];
            charArr[pointer1] = charArr[pointer2];
            charArr[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        //returns String representation of charArr
        return word.valueOf(charArr);
    }
}
