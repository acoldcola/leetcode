package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2021/9/21 21:12
 * @Version 1.0
 * 二叉搜索树中的众数
 */
public class leetcode501 {
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            map.put(treeNode.val,map.getOrDefault(treeNode.val,0) + 1);
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            res = Math.max(res, map.get(i));
        }
        List<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) == res) {
                list.add(i);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
}
