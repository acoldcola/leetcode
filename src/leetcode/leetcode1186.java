package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/26 17:21
 * @Version 1.0
 * 删除一次得到子数组最大和
 */
public class leetcode1186 {
    public int maximumSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][2];
        int res = arr[0];
        dp[0][0] = arr[0];
        dp[0][1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 不删除数字
            dp[i][0] = Math.max(dp[i - 1][0] + arr[i],arr[i]);
            // 删除之前的或者删除当前的
            dp[i][1] = Math.max(dp[i -1][0],dp[i - 1][1] + arr[i]);
            res = Math.max(res, Math.max(dp[i][0],dp[i][1]));
        }
        return res;
    }
}
