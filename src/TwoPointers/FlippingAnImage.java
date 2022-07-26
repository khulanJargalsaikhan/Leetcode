package TwoPointers;

import java.util.Arrays;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].
Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}})));
                                                                //[[1, 0, 0], [0, 1, 0], [1, 1, 1]]
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}})));
                                                                //[[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]

    }


    public static int[][] flipAndInvertImage(int[][] image) {
        int len = image[0].length;
        for (int[] row : image){
            //(len+1) - because we need to invert the middle digit
            for (int i=0; i< (len+1)/2; i++){
                //swap the digits in place (flipping) and invert at the same time
                int temp = row[i] ^ 1; // ^1 inverting ex: 1^1=>0, 0^1=>1 (bitwise)
                row[i] = row[len-1-i] ^ 1;
                row[len-1-i] = temp;
            }
        }
        return image;
    }
}
