package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2020/7/13 17:32
 * @Version 1.0
 *  递增子序列
 */
public class leetcode491 {

    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    private List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        leetcode491 l = new leetcode491();
        l.findSubsequences(new int[] {1,2,3,4,5,4,1,1,1,1});
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        if (nums == null) {
            return null;
        }
        dfs(0, Integer.MIN_VALUE, nums);
        return res;
    }

    private void dfs(int curIndex, int preValue, int[] nums) {
        if (curIndex >= nums.length) {
            if (temp.size() >= 2) {
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if (nums[curIndex] >= preValue) {
            temp.add(nums[curIndex]);
            dfs(curIndex + 1, nums[curIndex], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[curIndex] != preValue) {
            dfs(curIndex + 1, preValue, nums);
        }
    }
}