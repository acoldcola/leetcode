package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/21 11:12
 * @Version 1.0
 * 使用最小花费爬楼梯
 */
public class leetcode746 {
    public static void main(String[] args) {
        leetcode746 l = new leetcode746();
        l.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        if (cost.length <= 1) {
            return cost[0];
        }
        if (cost.length == 2) {
            return Math.min(cost[0],cost[1]);
        }
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-2] + cost[i-2],dp[i - 1] + cost[i - 1]);
        }
        return dp[dp.length - 1];
    }
}
