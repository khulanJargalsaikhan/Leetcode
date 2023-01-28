package Matrix;

public class AvailableCapturesForRook {
    public static void main(String[] args) {
        char[][] board =
                        {{'.','.','.','.','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'p','p','.','R','.','p','B','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','B','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'}};

        System.out.println(numRookCaptures(board));
    }
    public static int numRookCaptures(char[][] board) {
        int count = 0;
        int x = 0;
        int y = 0;

        //finding R's position
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (board[i][j] == 'R'){
                    x = i;
                    y = j;
                }
            }
        }

        //checking from R until (x,0)
        for (int j=y; j>=0; j--){
            if (board[x][j] == 'B'){
                break;
            }
            if (board[x][j] == 'p'){
                count++;
                break;
            }
        }

        //checking from R until (x,8)
        for (int j=y; j<8; j++){
            if (board[x][j] == 'B'){
                break;
            }
            if (board[x][j] == 'p'){
                count++;
                break;
            }
        }

        //checking from R until (0,y)
        for (int i=x; i>=0; i--){
            if (board[i][y] == 'B'){
                break;
            }
            if (board[i][y] == 'p'){
                count++;
                break;
            }
        }
        //checking from R until (8,y)
        for (int i=x; i<8; i++){
            if (board[i][y] == 'B'){
                break;
            }
            if (board[i][y] == 'p'){
                count++;
                break;
            }
        }

        return count;
    }
}
