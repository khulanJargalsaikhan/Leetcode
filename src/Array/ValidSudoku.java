package Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] board = 	{{'5','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}};

		System.out.println(isValidSudoku2(board));


	}

	/*
	 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated 
	 * according to the following rules:

		- Each row must contain the digits 1-9 without repetition.
		- Each column must contain the digits 1-9 without repetition.
		- Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
		board.length == 9
		board[i].length == 9
		board[i][j] is a digit 1-9 or '.'.
	 */

	public static boolean isValidSudoku(char[][] board) {

		
		HashSet<String> set = new HashSet<>();
		for(int row=0; row<9; row++){
			for(int col=0; col<9; col++){
				if(board[row][col] != '.'){
					String dRow = "row"+row+"val"+board[row][col];
					
					String dCol = "col"+col+"val"+board[row][col];
					
					String dQuad = ""+row/3 + col/3 + board[row][col];
					
					if(!set.add(dRow)||!set.add(dCol)||!set.add(dQuad)){
						return false;
					}
				}

			}
		}
		return true;

	}
	

	public static boolean isValidSudoku2(char[][] board) {
		
		HashSet<String> mySet = new HashSet<String>();
		
		for (int row=0; row<9; row++) {
			for(int col=0; col<9; col++) {
				char val = board[row][col];
				
				if (val != '.') {
					if (!mySet.add(val + " found in row " + row) || !mySet.add(val + " found in col " + col) || 
							!mySet.add(val + " found in sub box " + row/3 + col/3))
						return false;
				}
			}
		}
		
		return true;
	}

}
