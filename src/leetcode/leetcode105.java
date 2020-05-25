package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/5/22 16:38
 * @Version 1.0
 */
public class leetcode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                treeNode.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                treeNode.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
                break;
            }
        }
        return treeNode;
    }
}
