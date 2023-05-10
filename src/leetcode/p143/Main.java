package leetcode.p143;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        new Solution().reorderList(listNode1); // [1,4,2,3]

        ListNode listNode11 = new ListNode(1);
        ListNode listNode22 = new ListNode(2);
        ListNode listNode33 = new ListNode(3);
        ListNode listNode44 = new ListNode(4);
        ListNode listNode55 = new ListNode(5);
        listNode11.next = listNode22;
        listNode22.next = listNode33;
        listNode33.next = listNode44;
        listNode44.next = listNode55;
        new Solution().reorderList(listNode11); // [1,5,2,4,3]
    }
}
