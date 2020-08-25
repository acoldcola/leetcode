package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/8/25 14:04
 * @Version 1.0
 * 全排列||
 */
public class leetcode47 {
    private Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        dfs(nums,used,list);
        List<List<Integer>> list1 = new ArrayList<>(set);
        return list1;
    }

    private void dfs(int[] nums, boolean[] used, List<Integer> list) {
        if (list.size() == nums.length) {
            set.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == false) {
                used[i] = true;
                list.add(nums[i]);
                dfs(nums,used,list);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}