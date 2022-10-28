package LinkedList;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode headA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(2);
        ListNode nodeA3 = new ListNode(6);
        ListNode nodeA4 = new ListNode(3);
        ListNode nodeA5 = new ListNode(4);
        ListNode nodeA6 = new ListNode(5);
        ListNode nodeA7 = new ListNode(6);

        headA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;
        nodeA4.next = nodeA5;
        nodeA5.next = nodeA6;
        nodeA6.next = nodeA7;

        System.out.println(removeElements(headA1, 6)); //[1,2,3,4,5]

        ListNode headB1 = new ListNode(7);
        ListNode nodeB2 = new ListNode(7);
        ListNode nodeB3 = new ListNode(7);
        ListNode nodeB4 = new ListNode(7);

        headB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;

        System.out.println(removeElements(headB1, 7)); //[]
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode node = pre;
        while (pre.next != null){
            if (pre.next.val == val)
                pre.next = pre.next.next;
            else
                pre = pre.next;
        }
        return node.next;
    }
}
