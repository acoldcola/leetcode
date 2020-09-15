package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/15 16:57
 * @Version 1.0
 * 整数拆分
 */
public class leetcode343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++){
            for (int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i -j),j * dp[i-j]));
            }
        }
        return dp[n];
    }
}
