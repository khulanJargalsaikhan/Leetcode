package HashTable;

import java.util.Arrays;

public class IncreasingDecreasingString {
    public static void main(String[] args){
        System.out.println(sortString("aaaabbbbcccc"));  //abccbaabccba
        System.out.println(sortString("rat"));  //art
    }

    // Leetcode problem #1370
    public static String sortString(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int[] pool = new int[26];

        //creating a pool and counting all the chars
        for(char c : s.toCharArray()){
            pool[c-'a']++;
        }

        System.out.println(Arrays.toString(pool));

        while (len > 0){
            for(int i=0; i < pool.length && len > 0; i++){
                if (pool[i] > 0){
                    sb.append((char) ('a' + i));
                    pool[i]--;
                    len--;
                }
            }

            for(int i=25; i >= 0 && len > 0; i--){
                if(pool[i] > 0){
                    sb.append((char) ('a' + i));
                    pool[i]--;
                    len--;
                }
            }
        }

        return sb.toString();

    }
}
