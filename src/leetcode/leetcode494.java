package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/16 18:08
 * @Version 1.0
 * 目标和
 */
public class leetcode494 {
    public int res = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        dfs(0, nums, S);
        return res;
    }

    private void dfs(int i, int[] nums, int s) {
        if (i == nums.length) {
            if (s == 0) {
                res++;
            }
            return;
        }
        s -= nums[i];
        dfs(i + 1, nums, s);
        s += nums[i];
        s += nums[i];
        dfs(i + 1, nums, s);
        s -= nums[i];
    }
}
