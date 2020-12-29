package AcWing;

import java.util.Scanner;

/**
 * @Author ZhangKe
 * @Date 2020/12/29 11:29
 * @Version 1.0
 * 01背包问题
 */
public class AcWing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int[] c = new int[N];
        int[] w = new int[N];
        for (int i = 0; i < N;i++) {
            c[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }
        int[] dp = new int[V + 1];
        dp[0] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = V; j >= 0; j--) {
                dp[j] = Math.max(dp[j-1],dp[j - c[i]] + w[i]);
            }
        }
        System.out.println(dp[V]);
    }
}
