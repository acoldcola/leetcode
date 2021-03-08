package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/8 14:39
 * @Version 1.0
 * 路径总和 III
 */
public class leetcode437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        res += dfs(0,sum,root);
        res += pathSum(root.left,sum) + pathSum(root.right,sum);
        return res;
    }

    private int dfs(int a, int sum, TreeNode root) {
        if (root == null) {
            return 0;
        }
        int val = root.val + a;
        int x = 0;
        if (sum == val) {
            System.out.println(root.val);
            x++;
        }
        x += dfs(val,sum,root.left) + dfs(val,sum,root.right);
        return x;
    }
}
