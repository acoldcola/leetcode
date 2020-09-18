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
    public static void main(String[] args) {
        leetcode47 l = new leetcode47();
        l.permuteUnique(new int[]{1,1,2});
    }
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        dfs(nums,used,list,0);
        return lists;
    }

    private void dfs(int[] nums, boolean[] used, List<Integer> list,int cur) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = cur; i < nums.length; i++) {
            if (used[i] == false) {
                used[i] = true;
                list.add(nums[i]);
                dfs(nums,used,list,i + 1);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}