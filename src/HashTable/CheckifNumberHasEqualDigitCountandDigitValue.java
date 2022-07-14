package HashTable;

import java.util.Arrays;

public class CheckifNumberHasEqualDigitCountandDigitValue {
    /*
You are given a 0-indexed string num of length n consisting of digits.
Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num,
otherwise return false.
Example 1:
Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.
     */
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));  //true
        System.out.println(digitCount("030"));   //false

    }

    public static boolean digitCount(String num) {
        //create a pool and count the frequency of digit
        int[] pool = new int[10];
        for (int i=0; i<num.length(); i++){
            pool[num.charAt(i) - 48]++;
        }
        //compare num's digits with pool array
        for(int i=0; i<num.length(); i++){
            if ( (num.charAt(i) - 48) != pool[i]){
                return false;
            }
        }
        return true;
    }
}
