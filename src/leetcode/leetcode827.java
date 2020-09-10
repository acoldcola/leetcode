package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 14:57
 * @Version 1.0
 * 最大人工岛
 */
public class leetcode827 {
    public static void main(String[] args) {
        leetcode827 leetcode827 = new leetcode827();
        leetcode827.largestIsland(new int[][]{{1,0,1},{0,1,1}});
    }
    public int largestIsland(int[][] grid) {
        int max = 0;
        if (grid.length == 0) {
            return max;
        }
        int[][] a = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = grid[i][j];
                a[i][j] = temp;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int x = dfs(i, j, grid);
                    max = Math.max(x, max);
                }
            }
        }
        boolean[][] used = null;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (a[i][j] == 0) {
                    used = new boolean[grid.length][grid[0].length];
                    a[i][j] = 1;
                    int x = dfs1(i, j,a,used);
                    a[i][j] = 0;
                    max = Math.max(x, max);
                }
            }
        }
        return max;
    }
    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return 0;
        }
        if (grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = -1;
        return dfs(i - 1, j, grid) + dfs(i + 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid) + 1;
    }

    private int dfs1(int i, int j, int[][] grid,boolean[][] used) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return 0;
        }
        if (used[i][j] || grid[i][j] != 1) {
            return 0;
        }
        used[i][j] = true;
        int x = dfs1(i - 1, j, grid,used) + dfs1(i + 1, j, grid,used) + dfs1(i, j - 1, grid,used) + dfs1(i, j + 1, grid,used) + 1;
        return x;
    }
}
