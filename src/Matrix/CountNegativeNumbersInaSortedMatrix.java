package Matrix;

public class CountNegativeNumbersInaSortedMatrix {
    public static void main(String[] args) {
        System.out.println(countNegativesBS(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));  //8

        System.out.println(countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));  //8
    }
    //Leetcode #1351
    //using binary search
    public static int countNegativesBS(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i=0; i<row; i++){
            int start = 0;
            int end = col - 1;
            int mid = 0;

            while (start <= end){
                mid = (start + end) / 2;
                if (grid[i][mid] < 0){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            count += col - start;
        }
        return count;
    }

    //better solution
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = m - 1;
        int col = 0;
        int count = 0;

        while(row >= 0 && col < n) {
            if(grid[row][col] < 0) {
                row--;
                count += n - col;
            }
            else
                col++;
        }
        return count;
    }
}
