package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 22:46
 * @Version 1.0
 * 和为 K 的最少斐波那契数字数目
 */
public class leetcode5373 {
    public static void main(String[] args) {
        leetcode5373 leetcode5373 = new leetcode5373();
        leetcode5373.findMinFibonacciNumbers(3);
    }
    public int findMinFibonacciNumbers(int k) {
        int[] dp = new int[k > 3 ? k + 1: 5];
        dp[1] = 1;
        dp[2] = 1;
        int i = 3;
        while (true && i < dp.length) {
            dp[i] = dp[i-1] + dp[i-2];
            if (dp[i] > k) {
                break;
            }
            i++;
        }
        int sum = 0;
        int count = 0;
        for (int j = i-1; j > 0; j--) {
            count += dp[j];
            if (count > k) {
                count -= dp[j];
            }else if(count < k){
                sum++;
            }else {
                break;
            }
        }
        return sum + 1;
    }
}
