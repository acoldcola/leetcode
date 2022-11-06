package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/30 22:47
 * @Version 1.0
 */
public class leetcode998 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        if(val>root.val){
            return new TreeNode(val,root,null);
        }
        root.right=insertIntoMaxTree(root.right,val);
        return root;
    }
}
