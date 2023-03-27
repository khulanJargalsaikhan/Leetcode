package Matrix;

public class SpecialPositionsInaBinaryMatrix {
    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}})); //1
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); //3

    }
    public static int numSpecial(int[][] mat) {
        /*
        Keep track of 1s in each row and in each column. Then while iterating over matrix,
        if the current position is 1 and current row as well as current column contains
        exactly one occurrence of 1.
        */
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        int ans = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}
