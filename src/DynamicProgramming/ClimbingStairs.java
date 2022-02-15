package DynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));  //3
		System.out.println(climbStairs(6));  //13
		
		System.out.println(climbStairs2(3));  //3
		System.out.println(climbStairs2(6));  //13
	}
	/*
	 * You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
	 */
	
	
	// time: O(n)
	// space: O(n)
	public static int climbStairs(int n) {     
        int[] arr = new int[n+2];
        
        arr[1] = 1;
        arr[2] = 2;
        
        for (int i=3; i<=n; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
	}

	// time: O(n)
	// space: O(1)  No using array extra space
	public static int climbStairs2(int n) {     
		
		int oneStep = 1;
		int twoStep = 2;
        // overriding previous two steps 
        for (int i=3; i<=n; i++){
            int temp = twoStep;		// this will be oneStep
            twoStep = oneStep + twoStep;   //getting 3rd step, also will be twoStep
            oneStep = temp;					
        }
        return twoStep;
	}
}
