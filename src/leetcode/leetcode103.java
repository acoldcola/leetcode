package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/12/22 9:24
 * @Version 1.0
 * 二叉树的锯齿形层序遍历
 */
public class leetcode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (flag) {
                lists.add(list);
                flag = false;
            }else {
                List<Integer> newList = new ArrayList<>();
                for (int i = list.size() - 1; i >= 0; i--) {
                    newList.add(list.get(i));
                }
                lists.add(newList);
                flag = true;
            }
        }
        return lists;
    }
}
