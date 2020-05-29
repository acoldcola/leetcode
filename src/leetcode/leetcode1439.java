package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/5/28 17:10
 * @Version 1.0
 * 有序矩阵中的第 k 个最小数组和
 */
public class leetcode1439 {
    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] a = new int[m*n*m*n];
        int b = 0;
        for (int i = 0;i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[b++] =0;
            }

        }
        return 0;
    }
}
