package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 15:06
 * @Version 1.0
 * 统计参与通信的服务器
 */
public class leetcode1267 {
    public static void main(String[] args) {
        countServers(new int[][] {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}});
    }
    public static int countServers(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (row[i] == 1 || col[j] == 1){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}
