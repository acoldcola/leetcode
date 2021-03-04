package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2021/3/4 15:11
 * @Version 1.0
 * 寻找重复的子树
 */
public class leetcode652 {
    public List<TreeNode> list = new ArrayList<>();
    public Map<String,Integer> map = new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null) {
            return list;
        }
        dfs(root);
        return list;
    }

    public String dfs(TreeNode A) {
        if (A == null) {
            return "";
        }
        String str = dfs(A.left) + ">" + dfs(A.right) + ">" + A.val;
        if (map.getOrDefault(str,0) == 1) {
            list.add(A);
        }
        map.put(str,map.getOrDefault(str,0) + 1);
        return str;
    }
}
