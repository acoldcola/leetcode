package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/7 11:41
 * @Version 1.0
 * 统计全 1 子矩形
 */
public class leetcode5454 {
    public static void main(String[] args) {
        leetcode5454 l = new leetcode5454();
        l.numSubmat(new int[][] {{1,0,1},{1,1,0},{1,1,0}});
    }
    public int numSubmat(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length;i++) {
            int res = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    res ++;
                }else {
                    res = 0;
                }
                dp[i][j] = res;
            }
        }
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <= mat[0].length-1; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = i; k >= 0; k--) {
                    min = Math.min(min,dp[k][j]);
                    sum += min;
                }
            }
        }
        return sum;
    }
}
