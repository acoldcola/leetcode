package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ZhangKe
 * @Date 2020/8/5 10:52
 * @Version 1.0
 *打家劫舍 III
 */
public class leetcode337 {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                sum += root.val;
                if (root.left != null) {
                    queue.offer(root.left);
                }
                if (root.right != null) {
                    queue.offer(root.right);
                }
            }
            list.add(sum);
        }
        int[] dp = new int[list.size() + 1];
        if (list.size() == 1) {
            return list.get(0);
        }
        dp[0] = 0;
        dp[1] = list.get(0);
        for (int i = 2; i < list.size(); i++) {
            dp[i] = Math.max(dp[i-2]+list.get(i-1),dp[i -1]);
        }
        return dp[dp.length];
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(7);
        int[] dp = new int[list.size() + 1];
        dp[0] = 0;
        dp[1] = list.get(0);
        for (int i = 2; i <= list.size(); i++) {
            dp[i] = Math.max(dp[i-2]+list.get(i-1),dp[i -1]);
        }
        System.out.println(dp[dp.length]);
    }
}
