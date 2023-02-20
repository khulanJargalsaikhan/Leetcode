package Matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {

        int[][] grid = {{1,2,3},       // [[9,1,2]
                        {4,5,6},       //  [3,4,5]
                        {7,8,9}};      //  [6,7,8]]
        System.out.println(shiftGrid(grid, 1));

        int[][] grid1 = {{3,8,1,9},             // [[12,0,21,13],
                        {19,7,2,5},             //  [3,8,1,9],
                        {4,6,11,10},            //  [19,7,2,5],
                        {12,0,21,13}};          //  [4,6,11,10]]

        System.out.println(shiftGrid(grid1, 4));
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;    //number of rows
        int n = grid[0].length; //number of columns
        int total = m * n; //will be used to flatten the 2D array
        k = k % (m * n); //every rows*col shifts grid became the same, skipping the similar shifts
        /* example: k = 10
                    m = 3
                    n = 3
                    k % (3 * 3) = 1 (we will loop only 1 time, that means k = 10 is equivalent to 1)

         ** How to flatten the 2D array to 1D array **
         example: grid[0][1] = 2
                  i * n + j = 0 * 3 + 1 =  1        -> ( we will use [1] instead of [0][1] )
                  grid[2][2] = 9
                  i * n + j = 2 * 3 + 2 = 6 + 2 = 8 -> ( we will use [8] instead of [2][2] )
         */

        int start = total - k % total; //start is the last value which is grid[n-1][n-1]
        /* example: grid = [[1,2,3],[4,5,6],[7,8,9]], k=1
        1 2 3
        4 5 6
        7 8 9
                    total = 9
                    k = 1
                    start = 9 - 1 % 9 = 9 - 1 = 8 //starting index which is flattened into 1D array
         */
        LinkedList<List<Integer>> result = new LinkedList<>();
        for (int i = start; i < total + start; i++){   //total+start = 9+8=17 why? bc we are starting from the last index, and then need to loop through the rest
            int moveIndex = i % total;
            int moveRow = moveIndex / n;
            int moveColumn = moveIndex % n;
            if ((i-start) % n == 0){
                result.add(new ArrayList()); //this will decide if it creates a new arraylist
            }
            result.peekLast().add(grid[moveRow][moveColumn]);
        }
        return result;
    }




}

