package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 17:10
 * @Version 1.0
 * 最长定差子序列
 */
public class leetcode1218 {
    public static void main(String[] args) {
        leetcode1218 leetcode1218 = new leetcode1218();
        leetcode1218.longestSubsequence(new int[] {1,2,3,4},1);
    }
    public int longestSubsequence(int[] arr, int difference) {
        /*int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] - arr[j] == difference) {
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            sum = Math.max(sum,dp[i]);
        }
        return sum;*/
        int ans = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            int temp = map.getOrDefault(i - difference, 0) + 1;
            map.put(i, temp);
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
