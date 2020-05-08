package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/26 17:08
 * @Version 1.0
 * 杨辉三角 II
 */
public class leetcode119 {
    public static void main(String[] args) {
        getRow(3);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        int[] a = new int[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0;j--) {
                if (j == 0 || j == i) {
                    a[j] = 1;
                }else {
                    a[j] = a[j] + a[j-1];
                }
            }
        }
        for (Integer m:
             a) {
            pre.add(m);
        }
        return pre;
    }
}