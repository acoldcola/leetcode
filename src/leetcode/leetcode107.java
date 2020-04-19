package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 21:49
 * @Version 1.0
 */
public class leetcode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            TreeNode node = queue.poll();
            for (int i = 0; i < size; i++) {
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            stack.push(list);
        }
        while (!stack.isEmpty()) {
            l.add(stack.pop());
        }
        return l;
    }
}
