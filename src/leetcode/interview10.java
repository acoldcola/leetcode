package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 16:14
 * @Version 1.0
 * 青蛙跳台阶问题
 */
public class interview10 {
    public int numWays(int n) {
        if (n <= n) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])% 1000000007;
        }
        return dp[n];
    }
}
