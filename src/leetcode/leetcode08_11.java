package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/23 9:53
 * @Version 1.0
 * 硬币
 */
public class leetcode08_11 {
    public int waysToChange(int n) {
        int[] dp = new int[n + 1];
        if (n < 5) {
            for (int i = 1; i <= n; i++) {
                dp[i] = 1;
            }
            return 1;
        }else if (n >=5 && n < 10) {
            for (int i = 5; i <= n; i++) {
                dp[i] = 2;
            }
            return 2;
        }
        return 0;
    }
}
