package LinkedList;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
        ListNode headA1 = new ListNode(4);
        ListNode nodeA2 = new ListNode(1);

        ListNode headC1 = new ListNode(8);
        ListNode nodeC2 = new ListNode(4);
        ListNode nodeC3 = new ListNode(5);

        ListNode headB1 = new ListNode(5);
        ListNode nodeB2 = new ListNode(6);
        ListNode nodeB3 = new ListNode(1);

        headA1.next = nodeA2;
        nodeA2.next = headC1;
        headC1.next = nodeC2;
        nodeC2.next = nodeC3;

        headB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = headC1;

        System.out.println(getIntersectionNode(headA1,headB1));  //8


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;
        while (a_pointer != b_pointer) {
            if (a_pointer == null)
                a_pointer = headB;
            else
                a_pointer = a_pointer.next;

            if (b_pointer == null)
                b_pointer = headA;
            else
                b_pointer = b_pointer.next;
        }
        return a_pointer;
    }
}
