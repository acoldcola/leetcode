package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 11:41
 * @Version 1.0
 */
public class interview16_22 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        if (grid.length == 0 || grid[0].length == 0){
            return max;
        }
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                int x = dfs(i,j,grid);
                max = Math.max(x,max);
            }
        }
        return max;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1){
            return 0;
        }
        if (grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 2;
        return dfs(i-1,j,grid) + dfs(i+1,j,grid) + dfs(i,j-1,grid) + dfs(i,j+1,grid) + 1;
    }
}
