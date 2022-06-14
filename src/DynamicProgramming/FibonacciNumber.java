package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
    public static void main(String[] args){
        System.out.println(fib(8));
        System.out.println(fib1(120));
        System.out.println(fib2(120));
    }
    /*
    The Fibonacci numbers, commonly denoted F(n) form a sequence,
    called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
    starting from 0 and 1. That is,
                        F(0) = 0, F(1) = 1
                        F(n) = F(n - 1) + F(n - 2), for n > 1.
    Given n, calculate F(n).

 n -> 0  1  2  3  4  5  6   7  8      <-- index
      0, 1, 1, 2, 3, 5, 8, 13, 21 ..
     */

    public static int fib(int n) {
        if (n <= 1) return n;
        int[] arr= new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i<=n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
    }

    //using memorization  (not working well ??)
    public static int fib1(int n) {
        if (n <= 1) return n;
        Map<Integer, Integer> memo = new HashMap<>();
        if (memo.containsKey(n))
            return memo.get(n);
        int value = fib1(n-1) + fib1(n-2);
        memo.put(n, value);
        return value;
    }


    // o(n)
    // replacing the numbers (a,b) every iteration
    public static int fib2(int n) {
       if (n <= 1) return n;
       int a = 0, b = 1;
       for (int i=2; i<=n; i++){
           int sum = a + b;
           //now a moves to b's position
           a = b;
           // b's value equals to sum
           b = sum;
       }
       return b;
    }
}
