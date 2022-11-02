package LinkedList;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        //ListNode [5,4,2,1]
        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(pairSum(head)); //[6]
    }

    public static int pairSum(ListNode head) {
        int max = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null){
            //finding middle
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is middle , now reversing from middle
        slow = reverse(slow);
        fast = head;

        while(slow != null){
            max = Math.max(slow.val + fast.val, max);
            slow = slow.next;
            fast = fast.next;
        }
        return max;
    }

    static ListNode reverse(ListNode head){
        ListNode prev = null, next = null;
        ListNode curr = head;
        /*
        prev    head/curr
         |      |
        NULL    2 -> 1 -> null
         |
        next

        2 -> 1 -> null         will be        null <- 2 <- 1
         */

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
