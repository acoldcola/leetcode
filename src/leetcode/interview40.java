package leetcode;

import javax.swing.*;
import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/3/20 15:18
 * @Version 1.0
 * 最小的k个数
 */
public class interview40 {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3};
        int k = 2;getLeastNumbers(arr,k);
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        int[] a = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            a[i] = arr[i];
        }
        return a;
    }
}
