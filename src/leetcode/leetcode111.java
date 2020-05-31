package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/29 17:34
 * @Version 1.0
 * 二叉树的最小深度
 */
public class leetcode111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }
}
