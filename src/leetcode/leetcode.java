package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/13 16:43
 * @Version 1.0
 * 石子游戏 IV
 */
public class leetcode {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j + i <= n; j++) {
                if (!dp[i]) {
                    dp[j * j + i] = true;
                }
            }
        }
        return dp[n];
    }
}
