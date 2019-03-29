/**
 * @auther ZhangKe
 * @date 2019/3/25 18:32
 */
public class leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode node = null;
        node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
