package Matrix;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));  //[[1,2,3],[8,9,4],[7,6,5]]
        System.out.println(Arrays.deepToString(generateMatrix(1)));  //[[1]]
    }
    /*
    Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
    1 2 3
    8 9 4
    7 6 5
     */
    public static int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];

        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int value = 1;

        while (left <= right && top <= bottom){
            for (int i=left; i<=right; i++){
                result[top][i] = value++;
            }
            top++;

            for (int i=top; i<=bottom; i++){
                result[i][right] = value++;
            }
            right--;

            for (int i=right; i>=left; i--){
                result[bottom][i] = value++;
            }
            bottom--;

            for (int i=bottom; i>=top; i--){
                result[i][left] = value++;
            }
            left++;
        }
        return result;
    }
}
