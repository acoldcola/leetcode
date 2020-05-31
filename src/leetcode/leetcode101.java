package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/5/31 20:37
 * @Version 1.0
 * 对称二叉树
 */
public class leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            // 每次出队两个节点 node1 和 node2
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            // 首先比较 node1 与 node2 这两个节点的值是否相等
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            // 再将 node1 的左节点与 node2 的右节点一起入队（以便两节点一起出队，进行比较）
            queue.offer(node1.left);
            queue.offer(node2.right);
            // 再将 node1 的右节点与 node2 的左节点一起入队（以便两节点一起出队，进行比较）
            queue.offer(node1.right);
            queue.offer(node2.left);
        }

        return true;
    }
}