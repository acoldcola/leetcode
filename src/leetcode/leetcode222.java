package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/22 16:58
 * @Version 1.0
 * 完全二叉树的节点个数
 */
public class leetcode222 {
    public int countNodes(TreeNode root) {
        return root == null ? 0 : countNodes(root.left)+countNodes(root.right) + 1;
    }
}
