package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/23 16:29
 * @Version 1.0
 * 爱生气的书店老板
 */
public class leetcode1052 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int[] a = new int[customers.length + 1];
        int[] b = new int[customers.length + 1];
        for (int i = 1; i < customers.length + 1; i++) {
            if (grumpy[i-1] == 0) {
                a[i] = a[i-1] + customers[i - 1];
            }else {
                a[i] = a[i-1];
            }
            b[i] = b[i - 1] + customers[i - 1];
        }
        if (X >= customers.length) {
            return b[b.length - 1];
        }
        int res = 0;
        for (int right = X; right < customers.length + 1; right++) {
            int left = right - X;
            res = Math.max(res, a[a.length - 1] - (a[right] - a[left]) + (b[right] - b[left]));
        }
        return res;
    }
}
