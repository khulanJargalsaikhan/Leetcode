package LinkedList;

/*
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */

public class ReverseLinkedList {

	//Iterative solution
	public ListNode reverseList(ListNode head) {

		ListNode newHead = null;
		ListNode curr = head;

		while (curr != null){
			ListNode next = curr.next;
			curr.next = newHead;
			newHead = curr;
			curr = next;
		}

		return newHead;

	}


	// Recursive solution
	public ListNode reverseList2(ListNode head) { 
		return recursive (head, null);
	}

	public ListNode recursive(ListNode head, ListNode newHead){

		if (head == null)
			return newHead;

		ListNode next = head.next;
		head.next = newHead;
		newHead = head;
		head = next;

		return recursive(head, newHead);
	}

}
