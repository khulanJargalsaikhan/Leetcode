package Matrix;

import java.util.Arrays;

public class LargestLocalValuesInaMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(largestLocal(new int[][] {{9,9,8,1},{5,6,2,},{8,2,6,4},{6,2,2,2}}))); //[[9,9],[8,6]]
        System.out.println(Arrays.deepToString(largestLocal(new int[][] {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}}))); //[[2,2,2],[2,2,2],[2,2,2]]

    }

    //Leetcode #2373
    //Topic: Matrix - easy level
    public static int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];

        for (int i=0; i<result.length; i++){
            for (int j=0; j<result[i].length; j++){
                result[i][j]=findmax3x3grid(grid, i, j);
            }
        }
        return result;
    }

    private static int findmax3x3grid(int[][] grid, int row, int col){
        int max = Integer.MIN_VALUE;
        for (int i=row; i<=row+2; i++){    //this is giving "Index 3 out of bounds for length 3" exception
            for (int j=col; j<=col+2; j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}
