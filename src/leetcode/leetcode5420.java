package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/13 22:30
 * @Version 1.0
 */
public class leetcode5420 {
    public int[] finalPrices(int[] prices) {
        int[] a = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int x = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if ( x >= prices[j]) {
                    x -= prices[j];
                    break;
                }
            }
            a[i] = x;
        }
        return a;
    }
}
