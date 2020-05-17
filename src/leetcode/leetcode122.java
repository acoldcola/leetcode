package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/13 13:26
 * @Version 1.0
 * 买卖股票的最佳时机 II
 */
public class leetcode122 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = prices[i] - prices[i-1] > 0 ? max + prices[i] - prices[i-1] : max;
        }
        return max;
    }
}
