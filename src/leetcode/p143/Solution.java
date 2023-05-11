package leetcode.p143;

import java.util.Stack;

public class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        ListNode startNode = head;

        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        node = head;
        for (int i = 0; i < count; i++) {
            if (i > (count - 1) / 2) {
                stack.push(node);
            }
            node = node.next;
        }

        System.out.println(stack);

        for (int i = 0; i < count / 2; i++) {
            ListNode endNode = stack.pop();
            endNode.next = startNode.next;
            startNode.next = endNode;
            startNode = startNode.next.next;
        }
        startNode.next = null;
    }
}
