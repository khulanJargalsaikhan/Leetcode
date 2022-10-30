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
        System.out.println(removeElements2(headA1, 6)); //[1,2,3,4,5]

        ListNode headB1 = new ListNode(7);
        ListNode nodeB2 = new ListNode(7);
        ListNode nodeB3 = new ListNode(7);
        ListNode nodeB4 = new ListNode(7);

        headB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;

        System.out.println(removeElements(headB1, 7)); //[]
        System.out.println(removeElements2(headB1, 7)); //[]

        ListNode headC1 = new ListNode(2);
        ListNode nodeC2 = new ListNode(3);
        ListNode nodeC3 = new ListNode(1);
        ListNode nodeC4 = new ListNode(2);
        ListNode nodeC5 = new ListNode(2);

        headC1.next = nodeC2;
        nodeC2.next = nodeC3;
        nodeC3.next = nodeC4;
        nodeC4.next = nodeC5;

        System.out.println(removeElements(headC1, 2)); //[3,1]
        System.out.println(removeElements2(headC1, 2)); //[3,1]


    }


    public static ListNode removeElements(ListNode  head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while (dummy.next != null){
            if (dummy.next.val == val)
                dummy.next = dummy.next.next;
            else
                dummy = dummy.next;
        }
        return pre.next;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null){
            if (head.val == val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
