package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/5 13:45
 * @Version 1.0
 * 二叉树的最近公共祖先
 */
public class leetcode236 {
    public TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (dfs(root ,p) && dfs(root, q)) {
            res = root;
        }
        lowestCommonAncestor(root.left,p,q);
        lowestCommonAncestor(root.right,p,q);
        return res;
    }

    public boolean dfs(TreeNode root, TreeNode node) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            return true;
        }
        return dfs(root.left, node) || dfs(root.right, node);
    }
}
