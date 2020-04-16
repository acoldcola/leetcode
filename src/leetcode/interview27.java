package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 15:06
 * @Version 1.0
 * 二叉树的镜像
 */
public class interview27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.right;
        TreeNode right = root.left;
        root.left = left;
        root.right = right;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}