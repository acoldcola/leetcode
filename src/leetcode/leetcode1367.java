package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/20 15:25
 * @Version 1.0
 *  二叉树中的列表
 */
public class leetcode1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (dfs(head,root)) {
            return true;
        }
        return isSubPath(head.next,root.left) || isSubPath(head.next, root.right);
    }

    private boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val == root.val) {
            return dfs(head.next,root.left) | dfs(head.next,root.right);
        }else {
            return false;
        }
    }
}

