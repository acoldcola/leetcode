package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/4 12:19
 * @Version 1.0
 * 和为零的N个唯一整数
 */
public class leetcode1304 {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i] = i;
            sum += a[i];
        }
        a[n-1] = -sum;
        return a;
    }
}
