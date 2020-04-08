package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/8 16:44
 * @Version 1.0
 * 机器人的运动范围
 */
public class interview13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] v = new boolean[m][n];
        return dfs(0,0,m,n,k,v);
    }

    public int dfs(int i, int j,int m, int n,int k,boolean[][] v) {
        if (i < 0 || j < 0||i >= m || j >= n || (i/10 + i%10 + j/10 + j%10) > k || v[i][j] == true) {
            return 0;
        }
        v[i][j] = true;
        return dfs(i + 1,j,m,n,k,v) + dfs(i,j+1,m,n,k,v) + 1;
    }
}
