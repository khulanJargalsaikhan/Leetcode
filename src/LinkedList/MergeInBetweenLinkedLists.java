package LinkedList;

public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        //ListNode [0,1,2,3,4,5]
        ListNode list1 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        list1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        //ListNode [1000000,1000001,1000002]
        ListNode list2 = new ListNode(1000000);
        ListNode node2_1 = new ListNode(1000001);
        ListNode node2_2 = new ListNode(1000002);

        list2.next = node2_1;
        node2_1.next = node2_2;

        System.out.println(mergeInBetween(list1, 3, 4, list2)); // [0,1,2,1000000,1000001,1000002,5]
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1; //find a-1
        for (int i=1; i<a; i++){
            start = start.next;
        }
        ListNode end = start; //find b
        for (int i=a; i<=b; i++){
            end = end.next;
        }
        start.next = list2; //connect a-1 to list2
        while (list2.next != null){
            list2 = list2.next;  //find the last node of list2
        }
        list2.next = end.next;  //connect list2 to b+1
        return list1;
    }
}
