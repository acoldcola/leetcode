package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/27 16:06
 * @Version 1.0
 * 统计封闭岛屿的数目
 */
public class leetcode1254 {
    public static void main(String[] args) {
        leetcode1254 leetcode1254 = new leetcode1254();
        leetcode1254.closedIsland(new int[][] {{0,0,1},{0,1,0},{0,0,1}});
    }

    public int closedIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0 ; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) {
                    if (dfs(i,j,grid)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public boolean dfs(int i, int j,int[][] grid) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
            return false;
        }
        if (grid[i][j] == 0) {
            grid[i][j] = 2;
            boolean r1 = dfs(i-1,j,grid);
            boolean r2 = dfs(i,j-1,grid);
            boolean r3 = dfs(i+1,j,grid);
            boolean r4 = dfs(i,j+1,grid);
            return r1 && r2 && r3 && r4;
        }
        return true;
    }
}
