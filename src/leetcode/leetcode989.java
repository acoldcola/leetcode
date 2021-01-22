package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2021/1/22 13:50
 * @Version 1.0
 * 数组形式的整数加法
 */
public class leetcode989 {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            if (K > 0) {
                int a = K % 10;
                int res = a + A[i] + n;
                n = res / 10;
                list.add(res % 10);
                K /= 10;
            } else {
                int res = A[i] + n;
                n = res / 10;
                list.add(res % 10);
            }
        }
        while (K > 0) {
            int a = K % 10;
            int res = a + n;
            n = res / 10;
            list.add(res % 10);
            K /= 10;
        }
        if (n != 0) {
            list.add(n);
        }
        Collections.reverse(list);
        return list;
    }
}
