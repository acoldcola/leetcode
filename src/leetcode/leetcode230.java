package leetcode;

import leetcode.TreeNode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/2/2 17:30
 * @Version 1.0
 */
public class leetcode230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        Collections.sort(list);
        if (k > list.size()) {
            return 0;
        }
        return list.get(k - 1);
    }
}
