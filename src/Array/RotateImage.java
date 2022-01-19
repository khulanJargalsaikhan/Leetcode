package Array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {


		System.out.println(Arrays.deepToString(rotate(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}})));
		
		System.out.println(Arrays.deepToString(rotate(new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}})));

	}

	/*
	 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.

example1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

example2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
	 */


	public static int[][] rotate(int[][] matrix) {

		int n = matrix.length;
		
		//transposing (1st row became first col, 2nd row became 2nd col, 3rd row became 3rd col, etc)
		for (int i=0; i<n; i++){
			for (int j=i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}		
		}
		
		
		// reversing each row
		for (int i=0; i<n; i++) {
			int start = 0;
			int end = n-1;
			
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
		
		return matrix;
		
	}


}
