package LinkedList;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {
        //ListNode [0,1,0,3,0,2,2]
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(0);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        System.out.println(mergeNodes(head)); //[1,3,4]

    }

    public static ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode root = new ListNode();
        ListNode cur = root;
        while (head != null){
            if (head.val == 0 && sum != 0){
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }
        return root.next;
    }
}
