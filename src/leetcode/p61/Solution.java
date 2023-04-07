package leetcode.p61;

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        // 노드의 개수를 구한다.
        int nodeCount = 1;
        ListNode tmpNode = head;
        while (tmpNode.next != null) {
            nodeCount++;
            tmpNode = tmpNode.next;
        }
        // 기존 k가 노드의 개수보다 크면 원위치되는 계산을 제외하기 위해 나머지 연산
        k %= nodeCount;

        // 계산된 k만큼 마지막 노드를 첫번째 노드랑 연결시켜주고 마지막 전 노드를 null로 바꿔준다.
        while (k > 0) {
            ListNode cur = head;
            int count = 0;
            while (cur.next != null) {
                count++;
                cur = cur.next;
            }
            cur.next = head;
            head = cur;

            while (count > 0) {
                count--;
                cur = cur.next;
            }
            cur.next = null;
            k--;
        }
        return head;
    }
}