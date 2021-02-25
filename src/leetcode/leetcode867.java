package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/25 9:32
 * @Version 1.0
 * 转置矩阵
 */
public class leetcode867 {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
