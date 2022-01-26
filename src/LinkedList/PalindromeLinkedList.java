package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

	/*
	 * Given the head of a singly linked list, return true if it is a palindrome.
Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false
	 */


	//solution 1
	public static boolean isPalindrome(ListNode head) {
		List<Integer> vals = new ArrayList<>();

		ListNode currentNode = head;

		while (currentNode != null){
			vals.add(currentNode.val);
			currentNode = currentNode.next;
		}

		int front = 0;
		int back = vals.size() - 1;

		while (front < back){
			if (!vals.get(front).equals(vals.get(back)) )   
				return false;

			front++;
			back--;
		}

		return true;
	}

	//solution 2
	public static boolean isPalindrome2(ListNode head) {

		if (head == null){
			return true;
		}
		
		//finding the mid node
		ListNode slow = head;
		ListNode fast = head;
		ListNode mid = null;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		mid = slow;

		//reverse the list from mid node to end of node
		ListNode newHead = reverse(mid);

		// compare 2 head nodes values
		while (head != null && newHead != null) {
			if (head.val != newHead.val)
				return false;

			head = head.next;
			newHead = newHead.next;
		}

		return true;

	}

	
	// helper method
	private static ListNode reverse(ListNode head) {
		ListNode prev = null;

		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;

	}




}



