package Matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersIAMatrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][] { {1,10,4,2}, {9,3,8,7}, {15,16,17,12} }));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> min_list = new ArrayList<>();
        List<Integer> max_list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        /*
        [[1, 10, 4, 2],
         [9, 3,  8, 7],
         [15,16,17,12]]
         */

        int r = matrix.length;
        int c = matrix[0].length;

        //finding min in rows and keeping them in min_list
        for (int i=0; i<r; i++){
            int min = Integer.MAX_VALUE;
            for (int j=0; j<c; j++){
                min = Math.min(matrix[i][j], min);
            }
            min_list.add(min);
        }
        //finding max in cols and keeping them in max_list
        for (int j=0; j<c; j++){
            int max = Integer.MIN_VALUE;
            for (int i=0; i<r; i++){
                max = Math.max(matrix[i][j], max);
            }
            max_list.add(max);
        }

        //finding a lucky number
        for (int max : max_list){
            if (min_list.contains(max)){
                result.add(max);
                break;
            }
        }
        return result;

    }
}
