package leetcode.p2265;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int answer = 0;

    public int averageOfSubtree(TreeNode root) {
        if (root != null) {
            averageOfSubtree(root.left);
            averageOfSubtree(root.right);
            if (circuitTree(root, 1, 0)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean circuitTree(TreeNode root, int count, int sum) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sum += node.val;
            if (node.left != null) {
                queue.offer(node.left);
                count++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                count++;
            }
        }
        return root.val == sum / count;
    }
}
