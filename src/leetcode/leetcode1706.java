package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/29 16:46
 * @Version 1.0
 */
public class leetcode1706 {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid.length];
        for (int i = 0;i < grid[0].length;i++) {
            res[i] = recursion(grid,0,i);
        }
        return res;
    }

    public int recursion(int[][] grid, int i, int j) {
        if (i == grid.length) {
            return 1;
        }
        if ((j == 0 && grid[i][j] == -1) || (j == grid[0].length - 1 && grid[i][j] == 1)) {
            return -1;
        }
        if (grid[i][j] == 1 && grid[i][j+1] == -1) {
            return -1;
        }
        if (grid[i][j] == -1 && grid[i][j+1] == 1) {
            return -1;
        }
        return recursion(grid,i+1,j);
    }
}

