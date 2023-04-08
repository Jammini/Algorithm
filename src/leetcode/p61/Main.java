package leetcode.p61;

public class Main {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        System.out.println(new Solution().rotateRight(listNode1, 2)); // [4,5,1,2,3]

        ListNode listNode0 = new ListNode(0);
        listNode0.next = listNode1;
        listNode2.next = null;
        System.out.println(new Solution().rotateRight(listNode1, 2)); // 2
    }
}
