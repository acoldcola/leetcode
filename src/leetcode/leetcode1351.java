package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 13:41
 * @Version 1.0
 * 统计有序矩阵中的负数
 */
public class leetcode1351 {
    public static void main(String[] args) {
        int a[][] ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int x = countNegatives(a);
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = m - 1;
        int j = n - 1;
        int x = 0;
        while (grid[i][j] < 0) {
            i --;
            j --;
        }
        for (int o = i; o < n; o++) {
            for(int p = 0; p < j;p++) {
                if (grid[o][p] < 0) {
                    x++;
                }
            }
        }
        for (int u = 0;u < i;u++) {
            for (int v = j; v < m; v++) {
                if (grid[u][v] < 0) {
                    x++;
                }
            }
        }
        return x + (m-i)*(m-i);
    }
}
