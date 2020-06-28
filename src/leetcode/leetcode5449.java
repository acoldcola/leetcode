package leetcode;

import java.util.*;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 10:39
 * @Version 1.0
 */
public class leetcode5449 {
    public static void main(String[] args) {
        leetcode5449 leetcode5449 = new leetcode5449();
        leetcode5449.canArrange(new int[] {1,2,3,4,5,10,6,7,8,9},5);
    }
    public boolean canArrange(int[] arr, int k) {
        int[] a = new int[k];
        for (int i = 0; i < arr.length; i++) {
            a[(arr[i] % k + k) % k] ++;
        }
        for (int i = 1; i <= k / 2; i++) {
            if (a[i] != a[k-i]) {
                return false;
            }
        }
        return a[0] % 2 == 0;
    }
}
