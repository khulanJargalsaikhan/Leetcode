package Matrix;

import java.util.HashMap;
import java.util.Map;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}})); //true
        System.out.println(isToeplitzMatrix(new int[][] {{1,2},{2,2}})); //false

        System.out.println(isToeplitzMatrix2(new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        System.out.println(isToeplitzMatrix2(new int[][] {{1,2},{2,2}}));
    }
    //solution 1 - using hashmap
    //r1 - c1 == r2 - c2

    public static boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> check = new HashMap<>();
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[0].length; c++){
                if (!check.containsKey(r-c)){
                    check.put(r-c, matrix[r][c]);
                } else {
                    if (check.get(r-c) != matrix[r][c]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //solution 2 - comparing top-left neighbour
    public static boolean isToeplitzMatrix2(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[0].length; c++){
                if (r > 0 && c > 0 && matrix[r][c] != matrix[r-1][c-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
