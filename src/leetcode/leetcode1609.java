package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2022/8/18 23:46
 * @Version 1.0
 * 奇偶树
 */
public class leetcode1609 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = false;
        if (root.val % 2 == 0) {
            return false;
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    if (flag) {
                        if (node.val % 2 != 0) {
                            return false;
                        }
                    } else {
                        if (node.val % 2 == 0) {
                            return false;
                        }
                    }
                }else {
                    if (flag) {
                        if (node.val % 2 != 0 || node.val >= list.get(i-1))  {
                            return false;
                        }
                    } else {
                        if (node.val % 2 == 0 || node.val <= list.get(i-1)) {
                            return false;
                        }
                    }
                }
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag = !flag;
        }
        return true;
    }
}
