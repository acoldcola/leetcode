package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/16 15:19
 * @Version 1.0
 * 二叉搜索树的范围和
 */
public class leetcode938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val == L) {
            sum +=1;
        }
        return 0;
    }
}
