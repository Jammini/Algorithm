package leetcode.p2265;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode4.left = treeNode8;
        treeNode4.right = treeNode5;
        treeNode8.left = treeNode0;
        treeNode8.right = treeNode1;
        treeNode5.right = treeNode6;
        System.out.println(new Solution().averageOfSubtree(treeNode4)); // 5
        TreeNode treeNode = new TreeNode(1);
        System.out.println(new Solution().averageOfSubtree(treeNode)); // 1
    }
}
