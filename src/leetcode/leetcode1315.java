package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/5 10:10
 * @Version 1.0
 * 祖父节点值为偶数的节点和
 */
public class leetcode1315 {
    public int sumEvenGrandparent(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        if (root.val % 2 == 0) {
            res += dfs(root.left,1) + dfs(root.right,1);
            System.out.println(dfs(root.left,0) +"-"+ dfs(root.right,0));
        }
        return res + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }

    public int dfs(TreeNode node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 2) {
            return node.val;
        }
        return dfs(node.left,level + 1) + dfs(node.right,level + 1);
    }
}
