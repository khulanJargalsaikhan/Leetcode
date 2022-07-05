package HashTable;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
/*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
"-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

Example 1:
Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
 */

    public static void main(String[] args){
        System.out.println(uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));  //2
    }

    public static int uniqueMorseRepresentations(String[] words) {
        //save 26 morse code into a new array
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
                "-","..-","...-",".--","-..-","-.--","--.."};
        //this will save unique transformation
        Set<String> seen = new HashSet<>();
        //loop through every word in words
        for (String word : words){
            //will use string builder to concatenate matching morse code from array 'morse'
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()){
                //if char is a, then 97-97 = morse[0]
                sb.append(morse[c-97]);
            }
            seen.add(sb.toString());
        }
        //seen size is the number of different transformations
        return seen.size();
    }
}
