package leetcode;

import sun.security.util.Length;

import java.util.logging.Level;

/**
 * @Author ZhangKe
 * @Date 2020/3/4 14:50
 * @Version 1.0
 * 最小路径和
 */
public class leetcode64 {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (n <= 0 && m <= 0) {
            return 0;
        }
        int mix[][] = new int[n][m];
        mix[0][0] = grid[0][0];
        for (int j = 1; j < m; j++) {
            mix[0][j] = mix[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            mix[i][0] = mix[i - 1][0] + grid[i][0];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mix[i][j] = Math.min(mix[i][j - 1], mix[i - 1][j]) + grid[i][j];
            }
        }
        return mix[n - 1][m - 1];
    }
}
