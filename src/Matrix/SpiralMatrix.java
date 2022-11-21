package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    /*
               right   left
                |       |
    top   -->   1   2   3
                4   5   6
    bottom -->  7   8   9

    [1,2,3,6,9,8,7,4,5]  = m * n


     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        List<Integer> res = new ArrayList<>();

        while (res.size() < m * n){
            for (int i=left; i<=right && res.size() < m*n; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for (int j=top; j<=bottom && res.size() < m*n; j++){
                res.add(matrix[j][right]);
            }
            right--;

            for (int i=right; i>=left && res.size() < m*n; i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int j=bottom; j>=top && res.size() < m*n; j--){
                res.add(matrix[j][left]);
            }
            left++;
        }

        return res;
    }
}
