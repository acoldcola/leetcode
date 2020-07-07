package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/7 9:34
 * @Version 1.0
 * 路径总和
 */
public class leetcode112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
