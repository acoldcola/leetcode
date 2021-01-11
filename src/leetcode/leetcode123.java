package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/9 11:09
 * @Version 1.0
 */
public class leetcode123 {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2];
        dp[0][1][0] = 0;
        dp[0][1][1] = -prices[0];
        dp[0][2][0] = 0;
        dp[0][2][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][1][1] + prices[i]);
            dp[i][1][1] = Math.max(dp[i-1][1][1],dp[i-1][0][0] - prices[i]);
            dp[i][2][0] = Math.max(dp[i-1][2][0],dp[i-1][2][1] + prices[i]);
            dp[i][2][1] = Math.max(dp[i-1][2][1],dp[i-1][1][0] - prices[i]);
        }
        return dp[prices.length - 1][2][0];
    }
}
