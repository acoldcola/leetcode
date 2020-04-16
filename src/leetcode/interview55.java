package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 9:51
 * @Version 1.0
 * 二叉树的深度
 */
public class interview55 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left,right);
    }
}
