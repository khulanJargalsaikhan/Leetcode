package Design;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		
		//Explanation
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin()); // return -3
		minStack.pop();
		System.out.println(minStack.top());   // return 0
		System.out.println(minStack.getMin()); // return -2	
		
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-1);
		minStack.pop();
		minStack.pop();

		
	}

	Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

	    
    
    public void push(int val) {
    	// only push the old minimum value when the current 
        // minimum value changes after pushing the new value val
        if (val <= min){
            stack.push(min);
            min = val;
        } 
        stack.push(val);
    }
    
    public void pop() {
    	// if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        int peek = stack.pop();
    	if(peek == min){
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
    
    
	/* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.


Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]


	 */




}
