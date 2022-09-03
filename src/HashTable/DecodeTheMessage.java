package HashTable;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv")); //"this is a secret"
    }
    //Leetcode #2325
    public static String decodeMessage(String key, String message) {

        Map<Character, Character> map = new HashMap<>();
        char ch = 'a';
        //Iterate through the characters in the key to construct a mapping to the English alphabet.
        //Make sure to check that the current character is not already in the mapping (only the first appearance is considered).
        for (int i=0; i<key.length(); i++){
            if(key.charAt(i) != ' ' && !map.containsKey(key.charAt(i)))
                map.put(key.charAt(i), ch++);
        }
        //Map the characters in the message according to the constructed mapping.
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<message.length(); i++){
            if (message.charAt(i) == ' ')
                sb.append(' ');
            else
                sb.append(map.get(message.charAt(i)));
        }

        return sb.toString();
    }
}
