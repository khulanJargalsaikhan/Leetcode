package HashTable;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode #1742.
You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive
(i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.
Your job at this factory is to put each ball in the box with a number equal to the sum of digits of
the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and
the ball number 10 will be put in the box number 1 + 0 = 1.
Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.
Example 1:
Input: lowLimit = 1, highLimit = 10
Output: 2
Explanation:
Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
Box 1 has the most number of balls with 2 balls.
 */
public class MaximumNumberofBallsinaBox {
    public static void main(String[] args) {
        System.out.println(countBalls(1,10));

        System.out.println(countBalls2(1,10));

    }
    //brute force solution
    public static int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i=lowLimit; i<=highLimit; i++){
            if (i < 10){
                map.put(i, map.getOrDefault(i, 0) + 1);
                result = Math.max(result, map.get(i));
            } else {
                int num = i;
                int sumNum = 0;
                while (num != 0){
                    sumNum += num % 10;
                    num = num / 10;
                }
                map.put(sumNum, map.getOrDefault(sumNum, 0) + 1);
                result = Math.max(result, map.get(sumNum));
            }
        }
        return result;
    }
    //better solution
    public static int countBalls2(int lowLimit, int highLimit) {
        int result = 0;
        /* Constraints: 1 <= lowLimit <= highLimit <= 10^5
        10^5 = 100000 = 1
        99999 = 9+9+9+9+9 = 45
        45 + 1 = 46
         */
        int[] pool = new int[46];
        for (int i = lowLimit; i <= highLimit; i++){
            //we need helper method to find out sum of digits
            pool[digitSum(i)]++;
        }
        for (int i=0; i<46; i++){
            result = Math.max(result, pool[i]);
        }
        return result;
    }

    //helper method return sum of digits
    public static int digitSum(int digit){
        int sum = 0;
        while (digit > 0){
            sum += digit % 10;
            digit = digit / 10;
        }
        return sum;
    }

}
