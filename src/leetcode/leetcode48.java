package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/19 15:22
 * @Version 1.0
 * 旋转图像
 */
public class leetcode48 {
    // public void rotate(int[][] matrix) {
    //     int temp;
    //     int o = 0;
    //     int p = 0;
    //     for (int i = o;i < matrix.length; i++) {
    //         for (int j = p;j < matrix.length; j++) {
    //             temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    //         o++;
    //         p++;
    //     }
    //     for (int i = 0;i < matrix.length; i++) {
    //         int m = matrix.length - 1;
    //         for (int j = 0;j < matrix.length/2; j++) {
    //             temp = matrix[i][j];
    //             matrix[i][j] = matrix[i][m];
    //             matrix[i][m] = temp;
    //             m--;
    //         }
    //     }
    // }
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-j][n-i];
                matrix[m-j][n-i] = temp;
            }
        }
        for (int i = 0;i < matrix.length / 2; i ++) {
            for (int j = 0;j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-i][j];
                matrix[m-i][j] = temp;
            }
        }
        return;
    }
}
