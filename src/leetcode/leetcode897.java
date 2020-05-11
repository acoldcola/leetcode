package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/5/11 13:30
 * @Version 1.0
 * 递增顺序查找树
 */
public class leetcode897 {
    public TreeNode increasingBST(TreeNode root) {
        // 获取所有树节点的值
        List<Integer> list = new ArrayList<>();
        TreeNode treeNode = new TreeNode(0);
        TreeNode head = treeNode;
        getTree(list,root);
        for (Integer x : list) {
            head.right = new TreeNode(x);
            head = head.right;
        }
        return treeNode.right;
    }

    public void getTree(List list, TreeNode root) {
        if (root == null) {
            return;
        }
        getTree(list,root.left);
        list.add(root.val);
        getTree(list,root.right);
    }
}