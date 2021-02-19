package 竞赛.第227场周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/2/7 11:50
 * @Version 1.0
 */
public class test4 {
    public static void main(String[] args) {
        minAbsDifference(new int[]{7,-9,15,-2},-5);
    }
    public static int minAbsDifference(int[] nums, int goal) {
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, Math.abs(goal));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(dp[i]) > Math.abs(dp[j] + nums[i] - goal)){
                    dp[i] = dp[j] + nums[i] - goal;
                }
            }
            res = Math.min(Math.abs(dp[i]), res);
        }
        return res;
    }
}
