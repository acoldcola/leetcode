package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/7/2 17:14
 * @Version 1.0
 * 有序矩阵中第K小的元素
 */
public class leetcode378 {
    public int kthSmallest(int[][] matrix, int k) {
        int[] a = new int[matrix[0].length * matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                a[i * matrix[0].length + j] = matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k];
    }
}
