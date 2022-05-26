package Array;

import java.util.Arrays;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(matrixReshape(new int[][] {{1,2},{3,4}}, 1, 4))); 
	
		System.out.println(Arrays.deepToString(matrixReshape2(new int[][] {{1,2},{3,4}}, 1, 4))); 

	}
	/*
Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
	 */

	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		int m = mat.length;
		int n = mat[0].length;
		int[][] result = new int[r][c];

		if (n*m != r*c)
			return mat;

		for (int i=0; i<r*c; i++){
			result[i/c][i%c] = mat[i/n][i%n];
		}

		return result;
	}
	
	public static int[][] matrixReshape2(int[][] mat, int r, int c) {

		int rows = mat.length;
		int columns = mat[0].length;
		int[][] result = new int[r][c];

		if (rows*columns != r*c)
			return mat;
		
		int result_row = 0;
		int result_col = 0;

		for (int i=0; i<rows; i++){
			for(int k=0; k<columns; k++) {
				result[result_row][result_col] = mat[i][k];
				result_col++;
				if (result_col == c) {
					result_col = 0;
					result_row++;
				}
			}
		}

		return result;
	}

}
