package Matrix;

public class CheckIfMatrixIsXMatrix {
    public static void main(String[] args) {
        System.out.println(checkXMatrix(new int[][] {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}})); //true
        System.out.println(checkXMatrix(new int[][] {{5,7,0},{0,3,1},{0,5,0}})); // false

    }
    /*
    Algorithm explain:
    1. Assuming a 0-indexed matrix, for a given cell on row i and column j,
    it is in a diagonal if and only if i == j or i == n - 1 - j.
    2. We can then iterate through the elements in the matrix to check
    if all the elements in the diagonals are non-zero and all other elements are zero.
     */
    public static boolean checkXMatrix(int[][] grid) {
        boolean result = false;
        int n = grid.length;
        for  (int i=0; i<grid.length; i++){
            for (int j=0; j<grid.length; j++){
                if ((i == j || i == n-1-j) && grid[i][j] != 0){
                    result = true;
                }else if ((i == j || i == n-1-j) && grid[i][j] == 0){
                    return false;
                }else if (grid[i][j] == 0){
                    result = true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
