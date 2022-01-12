package leetcode;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] arr = new int[] {5, 3, 5, 7};
		
		System.out.println(Arrays.toString(function(arr, 10)));
		
//		List<String> words = new ArrayList<String>(Arrays.asList("Hello", "World"));
//		words.remove("Hello");
//		System.out.println(words);
	 
	}
	
	public static int[] function(int[] arr, int target) {
		
		int[] arrIndex = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(target == arr[i] + arr[j]) {
					arrIndex[0] = i;
					arrIndex[1] = j;
				}
			}
		}
			
		return arrIndex;
	}
}
