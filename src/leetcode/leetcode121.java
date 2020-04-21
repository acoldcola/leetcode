package leetcode;

import sun.management.snmp.util.MibLogger;

/**
 * @auther ZhangKe
 * @date 2019/8/15 17:05
 * 买卖股票的最佳时机
 */
public class leetcode121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        // 最小的价格
        int min = prices[0];
        // 最大的收益
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}