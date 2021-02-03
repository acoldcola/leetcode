package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/2 16:07
 * @Version 1.0
 * 分割回文串 II
 */
public class leetcode132 {
    public static int minCut(String s) {
        // 预处理回文串数组
        boolean[][] a = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                // 判断回文串，首字母和尾字母相同，子串是回文串那么，当前串也是回文串
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || a[j+1][i-1])) {
                    a[j][i] = true;
                }
            }
        }
        int[] dp = new int[s.length()];
        dp[0] = 0;
        // 设置最大分割回文串需要的次数
        for (int i = 1; i < s.length(); i++) {
            dp[i] = i;
        }
        for (int i = 1; i < s.length(); i++) {
            if (a[0][i]) {
                dp[i] = 0;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (a[j+1][i]) {
                    dp[i] = Math.min(dp[i],dp[j] + 1);
                }
            }
        }
        return dp[dp.length - 1];
    }
}
