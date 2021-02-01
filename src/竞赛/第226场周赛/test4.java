package 竞赛.第226场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/1/31 11:08
 * @Version 1.0
 */
public class test4 {
    public boolean checkPartitioning(String s) {
        int[][] a = new int[s.length() + 1][s.length() + 1];
        for (int i = s.length(); i >= 1; i--) {
            for (int j = i; j <= s.length(); j++) {
                if (j - i >= 2) {
                    a[i][j] = a[i + 1][j - 1];
                }
                if (s.charAt(i - 1) != s.charAt(j - 1)) {
                    a[i][j]++;
                }
            }
        }
        int[][] dp = new int[4][s.length() + 1];
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= s.length(); j++) {
                if (i == 1) {
                    dp[i][j] = a[i][j];
                } else {
                    dp[i][j] = dp[i - 1][i - 1] + a[i][j];
                    for (int x = i; x < j; x++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][x] + a[x + 1][j]);
                    }
                }
            }
        }
        return dp[3][s.length()] == 0;
    }
}
