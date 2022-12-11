package Matrix;

public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}})); //16
    }
    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        //checking every cell
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] == 1){
                    result += 4;
                    //checking top
                    if (i>0 && grid[i-1][j]== 1){
                        result -= 2;
                    }
                    //checking left
                    if (j>0 && grid[i][j-1]== 1){
                        result -= 2;
                    }
                }

            }
        }
        return result;
    }
}
