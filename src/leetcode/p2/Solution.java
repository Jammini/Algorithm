package leetcode.p2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode startNode = resultNode;
        int sum = 0;
        while (l1 != null || l2 != null) {
            int l1Num = 0;
            int l2Num = 0;

            if (l1 != null) {
                l1Num = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Num = l2.val;
                l2 = l2.next;
            }
            sum += (l1Num + l2Num);
            resultNode.next = new ListNode(sum % 10);
            resultNode = resultNode.next;
            sum /= 10;
        }
        if (sum != 0) {
            resultNode.next = new ListNode(sum);
        }
        return startNode.next;
    }
}
