package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 9:58
 * @Version 1.0
 * N叉树的最大深度
 */
public class leetcode559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 1;
        for (Node node:root.children) {
            int x = maxDepth(node) + 1;
            max = Math.max(x,max);
        }
        return max;
    }
}
