package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 18:20
 * @Version 1.0
 * 将矩阵按对角线排序
 */
public class leetcode1329 {
    public static int[][] diagonalSort(int[][] mat) {
        for (int x = 0; x < mat[0].length; x++) {
            int i = 0;
            int j = x;
            for (int k = 0; k < mat[0].length - x - 1; k++) {
                for (int k2 = 1; k2 < mat[0].length - x && i+k2 < mat.length && j+k2 < mat[0].length; k2++) {
                    if (mat[i][j] > mat[i+k2][j+k2]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i+k2][j+k2];
                        mat[i+k2][j+k2] = temp;
                    }
                }
                i++;
                j++;
            }
        }
        for(int x = 1; x < mat.length; x++) {
            int i = x;
            int j = 0;
            for (int k = 0; k < mat.length - x - 1; k++) {
                for (int k2 = 1; k2 < mat.length - x && i+k2 < mat.length && j+k2 < mat[0].length; k2++) {
                    if (mat[i][j] > mat[i+k2][j+k2]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i+k2][j+k2];
                        mat[i+k2][j+k2] = temp;
                    }
                }
                i++;
                j++;
            }
        }
        return mat;
    }
}
