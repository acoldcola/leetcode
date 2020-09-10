package leetcode;

import com.sun.javafx.sg.prism.web.NGWebView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 17:36
 * @Version 1.0
 * 路径总和 II
 */
public class leetcode113 {
    public static void main(String[] args) {
        leetcode113 l = new leetcode113();
        l.pathSum(new TreeNode(1),1);
    }
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null){
            return lists;
        }
        if (root.left == null && root.right == null && root.val == sum){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
            return lists;
        }
        dfs(root,sum,new ArrayList<>());
        return lists;
    }

    private void dfs(TreeNode root, int sum, List<Integer> list) {
        if (root == null){
            if (sum == 0 && list.size() > 1){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null){
            dfs(root.left,sum - root.val,new ArrayList<>(list));
        }if (root.left != null){
            dfs(root.left,sum - root.val,new ArrayList<>(list));
        }if (root.right != null){
            dfs(root.right,sum - root.val,new ArrayList<>(list));
        }
    }
}
