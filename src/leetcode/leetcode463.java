package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/8/26 13:57
 * @Version 1.0
 * 岛屿的周长
 */
public class leetcode463 {
    public static void main(String[] args) {
        leetcode463 l = new leetcode463();
        l.islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}});
    }
    private int count = 0;
    private int[] x = {-1,0,1,0};
    private int[] y = {0,-1,0,1};
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        boolean[][] used = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(i,j,used,grid);
                    return count;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, boolean[][] used, int[][] grid) {
        if (!(i >=0 && i <= grid.length - 1 && j >=0 && j <= grid[0].length - 1)){
            count++;
            return;
        }
        if (used[i][j]) {
            return;
        }
        if (grid[i][j] == 0) {
            count++;
            return;
        }
        used[i][j] = true;
        int nx, ny;
        for(int o = 0; o < 4; o++) {
            nx = i + x[o];
            ny = j + y[o];
            dfs(nx,ny,used,grid);
        }
    }
}
