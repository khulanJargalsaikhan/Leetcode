package Matrix;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}}));  //6
    }
    // Leetcode #1672
    // Topic: Matrix
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                //Calculate the wealth of each customer
                sum += accounts[i][j];
            }
            //Find the maximum element in array.
            max = Math.max(max, sum);
        }
        return max;
    }
}
