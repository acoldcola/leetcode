package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/13 16:50
 * @Version 1.0
 * 统计最大组的数目
 */
public class leetcode1399 {
    public static void main(String[] args) {
        leetcode1399 leetcode1399 = new leetcode1399();
        leetcode1399.countLargestGroup(15);
    }
    public int countLargestGroup(int n) {
        int[] x = new int[37];
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int c = i;
            while (c > 0) {
                sum += c % 10;
                c /= 10;
            }
            x[sum]++;
        }
        int count = 0;
        Arrays.sort(x);
        int max = x[x.length - 1];
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] != max) {
                break;
            }
            count ++;
        }
        return count;
    }
}
