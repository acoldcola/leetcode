package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/6/8 17:55
 * @Version 1.0
 * 叶子相似的树
 */
public class leetcode892 {
    public static void main(String[] args) {
        leetcode892 l = new leetcode892();
        l.leafSimilar(new TreeNode(1),new TreeNode(2));
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        dfs(left,root1);
        dfs(right,root2);
        if (left.size() != right.size()) {
            return false;
        }
        for (int i = 0; i < left.size(); i++) {
            if (left.get(i) != right.get(i)) {
                return false;
            }
        }
        return true;
    }
    public void dfs(List<Integer> list,TreeNode root) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        if (root.left != null) {
            dfs(list,root.left);
        }
        if (root.right != null) {
            dfs(list,root.right);
        }
    }
}
