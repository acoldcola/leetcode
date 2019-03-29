import java.util.*;

/**
 * @auther ZhangKe
 * @date 2019/2/25 10:30
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class leetcode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        add(root,list);
        return list;
    }
    public void add(TreeNode root,List<Integer> list) {
        if (root == null) {
            return;
        }
        add(root.left,list);
        list.add(root.val);
        add(root.right,list);
    }
}
