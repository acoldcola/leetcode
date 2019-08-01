package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class leetcode104 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            Integer.bitCount(2);
            return 0;
        }
        int nleft = maxDepth(root.left);
        int nright = maxDepth(root.right);
        return nleft > nright ? nleft + 1 : nright + 1;
    }
}
