package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 16:28
 * @Version 1.0
 * 跳水板
 */
public class interview16_11 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) {
            return new int[0];
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <= k;i++) {
            hashSet.add(i * shorter + (k-i) * longer);
        }
        int[] a = new int[hashSet.size()];
        int i = 0;
        for (int x:hashSet) {
            a[i++] = x;
        }
        Arrays.sort(a);
        return a;
    }
}
