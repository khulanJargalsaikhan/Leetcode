package Matrix;

public class ProjectionAreaOf3DShapes {
    public static void main(String[] args) {
        System.out.println(projectionArea(new int[][] {{1,2},{3,4}})); //17
        System.out.println(projectionArea(new int[][] {{1,0},{0,2}})); //8
    }
    //brute force solution
    // Run-Time Complexity Analysis - O (n^2)
    public static int projectionArea(int[][] grid) {
        /*
        Algorithm:
1. projection of 3D bars on x plane = the sum of the max number in each column.
2. projection of 3D bars on y plane = the sum of the max number in each row.
3. projection of 3D shape on z plane = the count of those cells whose value is greater than 0.
4. Return the sum of the above three values.
        example:
        1 2->2
        3 4->4      4+2=6
        ^ ^
        3+4 = 7 + 6 = 13 + 4 (count > 0) = 17
        */

        int sum = 0;
        int z = 0;
        for (int i=0; i<grid.length; i++){
            int xmax = 0;
            for (int j=0; j<grid[i].length; j++){
                xmax = Math.max(xmax, grid[i][j]);
                if (grid[i][j] > 0){
                    z++;
                }
            }
            sum += xmax;
        }

        for(int j=0; j<grid[0].length; j++){
            int ymax = 0;
            for (int i=0; i<grid.length; i++){
                ymax = Math.max(ymax, grid[i][j]);
            }
            sum += ymax;
        }

        sum += z;
        return sum;
    }
}

