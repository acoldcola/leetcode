package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/8 14:19
 * @Version 1.0
 * 最大正方形
 */
public class leetcode221 {
    public static void main(String[] args) {
        char[][] chars = new char[][] {{'0','1'}};
        maximalSquare(chars);
    }
    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1;
                    }
                }else {
                    dp[i][j] = 0;
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max * max;
    }
}
