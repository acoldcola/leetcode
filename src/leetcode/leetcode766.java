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
        for (int i = 0;i < matrix.length; i++) {
            int a = i;
            Set<Integer> set = new HashSet<>();
            int j = 0;
            set.add(matrix[a++][j++]);
            while (a < matrix.length  && j < matrix[0].length) {
                if (set.add(matrix[a++][j++])) {
                    return false;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            int a = j;
            Set<Integer> set = new HashSet<>();
            int i = 0;
            set.add(matrix[i++][a++]);
            while (a < matrix[0].length && i < matrix.length) {
                if (set.add(matrix[i++][a++])) {
                    return false;
                }
            }
        }
        return true;
    }
}
