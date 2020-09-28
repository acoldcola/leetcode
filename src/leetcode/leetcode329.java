package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/9/24 16:47
 * @Version 1.0
 * 矩阵中的最长递增路径
 */
public class leetcode329 {
    public static void main(String[] args) {
        leetcode329 l = new leetcode329();
        l.longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}});
    }
    int[][] coord = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int[][] used = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                max = Math.max(max,dfs(i,j,matrix,used));
            }
        }
        return max;
    }

    private int dfs(int i, int j, int[][] matrix,int[][] used) {
        if (used[i][j] != 0){
            return used[i][j];
        }
        int sum = 0;
        for (int x = 0; x < 4;x++){
            int a = i;
            int b = j;
            a += coord[x][0];
            b += coord[x][1];
            if (a < 0 || a > matrix.length - 1 || b < 0 || b > matrix[0].length -1){
                continue;
            }else {
                if (matrix[a][b] > matrix[i][j]){
                    sum = Math.max(dfs(a,b,matrix,used),sum);
                }
            }
        }
        used[i][j] = sum + 1;
        return used[i][j];
    }
}
