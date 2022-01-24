package LinkedList;

/*
 * You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */

public class MergeTwoSortedLists {
	//Iterative solution
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode dummyHead = new ListNode(-1);
		ListNode curr = dummyHead;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val){
				curr.next = list1;
				list1 = list1.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
			}

			curr = curr.next;
		}

		if (list1 == null){
			curr.next = list2;
		} else {
			curr.next = list1;
		}

		return dummyHead.next;
	}
	
	
	//Recursive Solution
	
}
