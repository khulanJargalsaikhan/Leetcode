package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode headA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(1);
        ListNode nodeA3 = new ListNode(2);
        ListNode nodeA4 = new ListNode(3);
        ListNode nodeA5 = new ListNode(3);

        headA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;
        nodeA4.next = nodeA5;

        System.out.println(deleteDuplicates(headA1));  //[1,2,3]
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node = head;
        while (head != null && head.next != null){
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return node;
    }
}
