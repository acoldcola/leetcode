package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/3 11:30
 * @Version 1.0
 * 树的子结构
 */
public class offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }
        if (B == null) {
            return false;
        }
        boolean res = false;
        if (A.val == B.val) {
            res |= judge(A,B);
        }
        res = res || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        return res;
    }

    public boolean judge(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null && B != null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return judge(A.left,B.left) && judge(A.right, B.right);
    }
}
