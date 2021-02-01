package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author ZhangKe
 * @Date 2021/2/1 13:45
 * @Version 1.0
 * 公平的糖果棒交换
 */
public class leetcode888 {
    public static int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum1 = 0;
        int sum2 = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sum1 += A[i];
            set.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            sum2 += B[i];
        }
        int[] a = new int[2];
        int res = sum1 - sum2;
        for (int i = 0; i < B.length; i++) {
            int x = B[i] + res / 2;
            if (set.contains(x)) {
                a[0] = x;
                a[1] = B[i];
            }
        }
        return a;
    }
}
