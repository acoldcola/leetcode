package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/2/25 15:42
 * @Version 1.0
 * 最小差
 */
public class interview16_06 {
    public static void main(String[] args) {
        smallestDifference(new int[]{0},
                new int[]{4,12,19,23,127,235});
    }
    public static int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        long res = Long.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            res = Math.min(Math.abs((long)a[i] - (long)b[j]),res);
            if (a[i] > b[j]) {
                j++;
            }else {
                i++;
            }
        }
        return (int) res;
    }
}
