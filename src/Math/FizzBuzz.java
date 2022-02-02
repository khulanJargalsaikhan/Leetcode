package Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));

	}
	/*
	 * Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
	 */
	public static List<String> fizzBuzz(int n) {

		List<String> answer = new ArrayList<>();

		int i = 1;

		while ( i <= n ){

			if (i%3 == 0 && i%5 == 0){
				answer.add("FizzBuzz");
			} else if (i%3 == 0){
				answer.add("Fizz");
			} else if (i%5 == 0){
				answer.add("Buzz");    
			} else {
				answer.add(Integer.toString(i));
			}  

			i++;
		}

		return answer;


	}
}
