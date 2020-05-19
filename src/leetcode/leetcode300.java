package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/5/19 14:49
 * @Version 1.0
 * 最长上升子序列
 */
public class leetcode300 {
    public static void main(String[] args) {
        lengthOfLIS(new int[] {10,9,2,5,3,7,101,18});
    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
