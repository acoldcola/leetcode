package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 16:56
 * @Version 1.0
 * 零钱兑换
 */
public class leetcode322 {
    public static void main(String[] args) {
        leetcode322 leetcode322 = new leetcode322();
        int[] a = {1,2,5};
        leetcode322.coinChange(a,11);
    }
    public int coinChange(int[] coins, int amount) {
        int i = coins.length - 1;
        Arrays.sort(coins);
        int num = 0;
        while (amount > 0 && i >= 0) {
            if (amount >= coins[i]) {
                amount -= coins[i];
                num ++;
            }else {
                i--;
            }
        }
        return amount != 0 ? -1 : num;
    }
}
