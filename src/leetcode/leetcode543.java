package leetcode;

import java.util.logging.XMLFormatter;

/**
 * @auther ZhangKe
 * @date 2019/8/15 17:22
 * 二叉树的直径
 */
public class leetcode543 {
    private int x = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        count(root);
        return x;
    }

    public int count(TreeNode root){
        if(root == null) {
            return 0;
        }
        int l = count(root.left);
        int r = count(root.right);
        x = Math.max(l+r,x);
        return Math.max(l,r)+1;
    }
}
