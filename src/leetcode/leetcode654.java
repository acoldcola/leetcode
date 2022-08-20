package leetcode;

/**
 * @Author ZhangKe
 * @Date 2022/8/20 19:25
 * @Version 1.0
 * 最大二叉树
 */
public class leetcode654 {
    public static void main(String[] args) {
        leetcode654 leetcode654 = new leetcode654();
        leetcode654.constructMaximumBinaryTree(new int[] {1,2,3});
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        Integer res = getMax(nums, 0, nums.length - 1);
        TreeNode node = new TreeNode(nums[res]);
        dfs(node, 0, nums.length - 1, res, nums);
        return node;
    }

    public void dfs(TreeNode treeNode, int left, int right, int mid, int[] nums) {
        Integer leftRes = getMax(nums, left, mid - 1);
        if (leftRes != -1) {
            TreeNode leftNode = new TreeNode(nums[leftRes]);
            treeNode.left = leftNode;
            dfs(leftNode, left, mid - 1, leftRes, nums);
        }
        Integer rightRes = getMax(nums, mid + 1, right);
        if (rightRes != -1) {
            TreeNode rightNode = new TreeNode(nums[rightRes]);
            treeNode.right = rightNode;
            dfs(rightNode, mid + 1, right, rightRes, nums);
        }

    }

    public Integer getMax(int[] nums, int left, int right) {
        if (left < 0 || right > nums.length - 1) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int res = -1;
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                res = i;
            }
        }
        return res;
    }
}
