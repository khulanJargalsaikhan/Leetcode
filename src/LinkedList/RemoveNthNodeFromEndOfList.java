package LinkedList;
/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Input: head = [1], n = 1
Output: []
 */

public class RemoveNthNodeFromEndOfList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode dummyHead = new ListNode(-1);
	        dummyHead.next = head;
	        ListNode slow = dummyHead;
	        ListNode fast = dummyHead;
	        
	        for (int i=0; i<n; i++){
	            fast = fast.next;
	        }
	        
	        while (fast.next != null){
	            fast = fast.next;
	            slow = slow.next;
	        }
	        
	        slow.next = slow.next.next;
	        return dummyHead.next;        
	    }
}
