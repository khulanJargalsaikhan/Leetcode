package Matrix;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(grid)); //8
    }
    //brute force solution
    public static int deleteGreatestValue(int[][] grid) {
         for (int[] row : grid){
             Arrays.sort(row);
         }
         int result = 0;

         for (int j=grid[0].length-1; j>=0; j--){
             int max = 0;
             for (int i=0; i<grid.length; i++){
                 max = Math.max(max, grid[i][j]);
             }
             result += max;
         }
         return result;
    }
}
