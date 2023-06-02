package leetcode.p2;


public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
        new Solution().addTwoNumbers(listNode1, listNode2);
        new Solution().addTwoNumbers(new ListNode(0), new ListNode(0));
        ListNode listNode9 = new ListNode(9);
        listNode9.next = new ListNode(9);
        listNode9.next.next = new ListNode(9);
        listNode9.next.next.next = new ListNode(9);
        listNode9.next.next.next.next = new ListNode(9);
        listNode9.next.next.next.next.next = new ListNode(9);
        listNode9.next.next.next.next.next.next = new ListNode(9);
        new Solution().addTwoNumbers(listNode9, listNode9.next.next.next);
    }
}
