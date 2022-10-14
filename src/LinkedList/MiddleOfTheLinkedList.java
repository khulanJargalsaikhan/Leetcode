package LinkedList;

import java.util.List;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;
        ListNode forth = new ListNode(4);
        third.next = forth;
        ListNode fifth = new ListNode(5);
        forth.next = fifth;
        fifth.next = null;

        //System.out.println(head.toString());
        System.out.println(middleNode(head));
        System.out.println(middleNode2(head));

    }

    //solution 1
    public static ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int i = 0;
        while (head != null){
            arr[i++] = head;
            head = head.next;
        }

        return arr[i/2];
    }

    //solution 2 - using fast and slow pointer
    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}



