package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/20 14:37
 * @Version 1.0
 * 回文子串
 */
public class leetcode647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j ++) {
                if (s.charAt(i) == s.charAt(j) &&(i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
