package leetcode.p2181;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode rootNode = new ListNode();
        ListNode currentNode = new ListNode();
        rootNode = currentNode;
        int addElement = 0;

        while (head.next != null) { // 다음 노드가 없을때까지
            ListNode node = head.next;
            if (node.val == 0) { // 0을 만나면 계산해서 노드를 연결시켜준다.
                currentNode.next = new ListNode(addElement);
                currentNode = currentNode.next;
                addElement = 0;
            } else { // 0이 아니면 이전값을 계속 더해준다.
                addElement += node.val;
            }
            head.next = head.next.next;
        }
        return rootNode.next;
    }
}