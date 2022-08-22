package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2022/8/22 21:54
 * @Version 1.0
 * 输出二叉树
 */
public class leetcode655 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        TreeNode next = new TreeNode(4);
        left.right = next;
        leetcode655 leetcode655 = new leetcode655();
        leetcode655.printTree(root);
    }
    public Map<Integer,List<Integer>> map = new HashMap<>();
    List<String[]> res = new ArrayList<>();
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        int depth = dfs(root) - 1;
        int n = (int) (Math.pow(2,depth + 1) - 1);
        int mid = (n-1)/2;
        for (int i = 0; i <= depth; i++) {
            String[] a = new String[n];
            Arrays.fill(a,"");
            res.add(a);
        }
        dfs(root,0,mid,depth);
        for (int i = 0; i < res.size(); i++) {
            list.add(Arrays.asList(res.get(i)));
        }
        return list;
    }
    public void dfs(TreeNode root, Integer depth, Integer flag, Integer n) {
        if (root == null) {
            return;
        }
        String[] str = res.get(depth);
        str[flag] = String.valueOf(root.val);
        dfs(root.left,depth + 1, (int)(flag - Math.pow(2,n - depth - 1)),n);
        dfs(root.right,depth + 1,(int)(flag + Math.pow(2,n - depth - 1)),n);
    }
    public Integer dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left,right) + 1;
    }
}
