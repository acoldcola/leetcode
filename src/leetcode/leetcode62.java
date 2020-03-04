package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/3/4 15:36
 * @Version 1.0
 *不同路径
 */
public class leetcode62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
    public static int uniquePaths(int m, int n) {
        int mix[][] = new int[n][m];
        mix[0][0] = 1;
        if (m <= 0 && n <= 0) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            mix[i][0] = 1;
        }
        for (int j = 0; j < m; j ++) {
            mix[0][j] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mix[i][j] = mix[i-1][j]+mix[i][j-1];
            }
        }
        return mix[n-1][m-1];
    }
}
