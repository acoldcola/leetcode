package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/9/2 16:33
 * @Version 1.0
 * 二叉树中第二小的节点
 */
public class leetcode671 {
    private Set<Integer> set = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        dfs(root);
        if (set.size() < 2) {
            return -1;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(1);
    }
    // dfs
    private void dfs(TreeNode root) {
        if (root.left == null) {
            set.add(root.val);
            return;
        }
        dfs(root.left);
        dfs(root.right);
        set.add(Math.min(root.left.val, root.right.val));
    }
    // bfs
}
