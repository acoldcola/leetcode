package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/16 22:54
 * @Version 1.0
 */
public class leetcode5398 {
    public int goodNodes(TreeNode root) {
        return sum(root,Integer.MIN_VALUE);
    }
    public int sum(TreeNode root,int max) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val >= max){
            max = root.val;
            count ++;
        }
        if (max <= root.left.val){
            count += sum(root.left,max);
        }
        if (root.right != null && max <= root.right.val){
            count = sum(root.right,max);
        }
        return count;
    }
}