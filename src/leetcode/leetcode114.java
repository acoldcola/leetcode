package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/8 16:39
 * @Version 1.0
 */
public class leetcode114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode ans = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = ans;
    }
}
