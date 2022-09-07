package Matrix;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}}));  //25
    }

    //Leetcode #1572
    //Topic: Matrix
    public static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int i=0; i<len; i++){
            sum += mat[i][i];
            sum += mat[i][len-1-i];
        }
        //There will be overlap of elements in the primary and secondary diagonals if
        //and only if the length of the matrix is odd, which is at the center.
        if (len%2 != 0){
            sum -= mat[len/2][len/2];
        }
        return sum;
    }
}
