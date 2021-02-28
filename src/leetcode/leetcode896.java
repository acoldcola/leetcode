package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/28 15:50
 * @Version 1.0
 * 单调数列
 */
public class leetcode896 {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        int n = A.length;
        for (int i = 0; i < n - 1; ++i) {
            if (A[i] > A[i + 1]) {
                inc = false;
            }
            if (A[i] < A[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
