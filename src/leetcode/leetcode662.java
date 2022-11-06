package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/27 23:21
 * @Version 1.0
 */
public class leetcode662 {
    public int widthOfBinaryTree(TreeNode root) {
        int res = dfs(root,0);
        return (int) Math.pow(2,res);
    }

    private int dfs(TreeNode root, int level) {
        if (root == null) {
            return level;
        }
        return Math.max(dfs(root.left, level + 1), dfs(root.right, level + 1)) + 1;
    }
}
