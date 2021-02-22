package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2021/2/22 10:17
 * @Version 1.0
 *  托普利茨矩阵
 */
public class leetcode766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
