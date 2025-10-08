package leetcode.p988;

import java.util.*;

public class Solution {
    List<String> list;
    public String smallestFromLeaf(TreeNode root) {
        list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        Collections.sort(list);
        return list.get(0);
    }

    public void dfs(TreeNode node, StringBuilder currentPath) {
        if (node == null) {
            return;
        }
        currentPath.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            String literal = currentPath.reverse().toString();
            list.add(literal);
            currentPath.reverse();
        }

        dfs(node.left, currentPath);
        dfs(node.right, currentPath);

        currentPath.deleteCharAt(currentPath.length() - 1);
    }
}
