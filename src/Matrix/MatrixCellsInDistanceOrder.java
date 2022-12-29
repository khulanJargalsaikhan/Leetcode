package Matrix;

import java.util.Arrays;

public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 3, 1, 2)));
        //[[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
    }
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] allCells = new int[R * C][2];

        int p = 0;
        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                allCells[p++] = new int[]{i, j};
            }
        }

        System.out.println("before sorting");
        System.out.println(Arrays.deepToString(allCells));

        System.out.println("after sorting");
        Arrays.sort(allCells, (a, b ) -> {
            System.out.println("a");
            System.out.println(Arrays.toString(a));
            System.out.println("b");
            System.out.println(Arrays.toString(b));
            return Math.abs(a[0] - r0) + Math.abs(a[1] - c0) - Math.abs(b[0] - r0) - Math.abs(b[1] - c0);
        });

        return allCells;
    }

}
