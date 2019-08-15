package leetcode;

import javax.sql.rowset.FilteredRowSet;

/**
 * @auther ZhangKe
 * @date 2019/8/15 14:28
 * 打家劫舍
 */
public class leetcode198 {
    public static void main(String[] args){
        int[] a = {2,7,9,3,1};
        System.out.println(rob(a));
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int len = nums.length;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i-2] + nums[i - 1]);
        }
        return dp[len];
    }
}
