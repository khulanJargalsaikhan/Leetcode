package easy_problems;

public class NimGame {

	public static void main(String[] args) {
		System.out.println(canWinNim(4));  //false
		System.out.println(canWinNim(1));  //true
		System.out.println(canWinNim(2));  //true
		System.out.println(canWinNim(12));  //false

	}
	/*
	 * You are playing the following Nim Game with your friend:
Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming 
both you and your friend play optimally, otherwise return false.
	 */

	public static boolean canWinNim(int n) {
		//In order to win, have to ensure that you never reach the situation 
		//where there are exactly four stones on the pile on your turn.
		//same pattern repeats itself for n=4,8,12,16,…, basically all multiples of 4.
		return (n % 4 != 0);
	}

}
