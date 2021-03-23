package 竞赛.第232场周赛;

/**
 * @Author ZhangKe
 * @Date 2021/3/14 10:27
 * @Version 1.0
 */
public class test4 {
    public static void main(String[] args) {
        maximumScore(new int[]{6569,9667,3148,7698,1622,2194,793,9041,1670,1872},5);
    }

    public static int maximumScore(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[k] = nums[k];
        for (int i = k - 1; i >= 0; i--) {
            if (nums[i] < dp[i + 1]) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        int res = 0;
        for (int j = k; j < nums.length; j++) {
            dp[j] = nums[j];
            for (int i = 0; i <= j; i++) {
                if (dp[i] > nums[j]) {
                    dp[i] = nums[j];
                }
                int a = dp[i] * (j-i + 1);
                if (a > res) {
                    res = a;
                }
            }
        }
        return res;
    }
}
