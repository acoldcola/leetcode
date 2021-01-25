package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/25 13:33
 * @Version 1.0
 * 由斜杠划分区域
 */
public class leetcode959 {
    public int[][] index = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
    public int regionsBySlashes(String[] grid) {
        int[][] a = new int[grid.length * 3][grid[0].length() * 3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i].charAt(j) == '/') {
                    a[i * 3][j * 3 + 2] = 1;
                    a[i * 3 + 1][j * 3 +1] = 1;
                    a[i * 3 + 2][j * 3] = 1;
                }
                if (grid[i].charAt(j) == '\\') {
                    a[i * 3][j * 3] = 1;
                    a[i * 3 + 1][j * 3 +1] = 1;
                    a[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    dfs(a,i,j);
                    res ++;
                }
            }
        }
        return res;
    }

    private void dfs(int[][] a, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int m = x + index[i][0];
            int n = y + index[i][1];
            if (m >= 0 && m <= a.length - 1 && n >= 0 && n <= a.length - 1 && a[m][n] == 0) {
                a[m][n] = 1;
                dfs(a,m,n);
            }
        }
    }
}
