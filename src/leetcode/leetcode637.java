package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 10:10
 * @Version 1.0
 * 二叉树的层平均值
 */
public class leetcode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Double> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            long sum = 0;
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                sum += node.val;
            }
         list.add(Double.valueOf(sum)/Double.valueOf(length));
        }
        return list;
    }
}
