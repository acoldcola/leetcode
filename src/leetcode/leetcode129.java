package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/10/29 16:42
 * @Version 1.0
 * 求根到叶子节点数字之和
 */
public class leetcode129 {

    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode node, int pre){
        if (node == null){
            return 0;
        }
        int sum = node.val + pre * 10;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return dfs(node.left,sum) + dfs(node.right,sum);
    }
}
