package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/15 13:40
 * @Version 1.0
 * 不同的二叉搜索树
 */
public class leetcode96 {
    public static void main(String[] args) {
        leetcode96 l = new leetcode96();
        l.numTrees(3);
    }
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
