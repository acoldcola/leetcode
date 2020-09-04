package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/4 10:38
 * @Version 1.0
 * 二叉树的所有路径
 */
public class leetcode257 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(5);
        treeNode.left = treeNode1;
        treeNode.right =treeNode2;
        treeNode1.right = treeNode3;
        leetcode257 l = new leetcode257();
        l.binaryTreePaths(treeNode);
    }
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null) {
            return list;
        }
        String sb = "";
        sb +=root.val;
        def(root,sb);
        return list;
    }

    private void def(TreeNode root, String sb) {
        if (root.left == null && root.right == null){
            list.add(sb);
            return;
        }
        String l = sb;
        String r = sb;
        if (root.left != null){
            l +="->"+root.left.val;
            def(root.left,l);
        }
        if (root.right != null) {
            r +="->"+root.right.val;
            def(root.right,r);
        }
    }
}
