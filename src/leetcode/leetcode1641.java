package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/2/4 15:19
 * @Version 1.0
 *  统计字典序元音字符串的数目
 */
public class leetcode1641 {
    /*List<Integer> list = new ArrayList<>();
    public int countVowelStrings(int n) {
        return dfs(0,n, 0);
    }

    public int dfs(int start,int n, int sum) {
        if (list.size() == n) {
            sum++;
            return sum;
        }
        int a = sum;
        for (int i = start; i < 5; i++) {
            list.add(i);
            a = dfs(i,n, a);
            list.remove(list.size() - 1);
        }
        return a;
    }*/
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        Arrays.fill(dp[0],1);
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
            dp[i][2] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2];
            dp[i][3] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3];
            dp[i][4] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4];
        }
        return dp[n-1][0] + dp[n-1][1] + dp[n-1][2] + dp[n-1][3] + dp[n-1][4];
    }
}
