package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/17 16:16
 * @Version 1.0
 *  剪绳子 II
 */
public class offer14_2 {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++){
            for (int j = 1; j < i; j++){
                long a = j * (i -j);
                a %= (1e9 + 7);
                long b = j * dp[i-j];
                b %= (1e9 + 7);
                dp[i] = (int) Math.max(dp[i], Math.max(a,b));
            }
        }
        return dp[n];
    }
}
