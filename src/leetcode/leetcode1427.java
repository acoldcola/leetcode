package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/25 16:52
 * @Version 1.0
 * 二叉树中的伪回文路径
 */
public class leetcode1427 {
    public int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root,0);
        return count;
    }
    public void dfs(TreeNode node,int temp) {
        temp ^= (1 << node.val);
        if (node.left == null && node.right == null) {
            if (temp == 0 || (temp & (temp - 1)) == 0) {
                count ++;
            }
        }
        if (node.right != null) {
            dfs(node.right,temp);
        }
        if (node.left != null) {
            dfs(node.left,temp);
        }
        return;
    }
}
