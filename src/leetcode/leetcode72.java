package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/24 14:15
 * @Version 1.0
 */
public class leetcode72 {
    public static void main(String[] args) {
        minDistance("horse","ros");
    }
    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int j = 1; j <= word2.length(); j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }
        for (int i = 1; i <= word1.length(); i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1],Math.min(dp[i][j-1],dp[i-1][j])) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
