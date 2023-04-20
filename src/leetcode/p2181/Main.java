package leetcode.p2181;

/**
 * https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
 */
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(0);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(2);
        ListNode listNode8 = new ListNode(0);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = null;
        System.out.println(new Solution().mergeNodes(listNode1)); // [4,11]

        ListNode listNode11 = new ListNode(0);
        ListNode listNode22 = new ListNode(1);
        ListNode listNode33 = new ListNode(0);
        ListNode listNode44 = new ListNode(3);
        ListNode listNode55 = new ListNode(0);
        ListNode listNode66 = new ListNode(2);
        ListNode listNode77 = new ListNode(2);
        ListNode listNode88 = new ListNode(0);
        listNode11.next = listNode22;
        listNode22.next = listNode33;
        listNode33.next = listNode44;
        listNode44.next = listNode55;
        listNode55.next = listNode66;
        listNode66.next = listNode77;
        listNode77.next = listNode88;
        listNode88.next = null;
        System.out.println(new Solution().mergeNodes(listNode11)); // [1,3,4]
    }
}
