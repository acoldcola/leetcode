package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/6/7 11:01
 * @Version 1.0
 */
public class leetcode5429 {
    public static void main(String[] args) {
        leetcode5429 l = new leetcode5429();
        l.getStrongest(new int[] {1,2,3,4,5},2);
    }
    public int[] getStrongest(int[] arr, int k) {
        if (k >= arr.length) {
            return arr;
        }
        Arrays.sort(arr);
        int a = arr[(arr.length - 1) / 2];
        int[] b = new int[k];
        int x = 0;
        int left = 0;
        int right = arr.length - 1;
        while (x < k) {
            if (Math.abs(arr[right] - a) >= Math.abs(arr[left] - a)) {
                b[x] = arr[right--];
            }else {
                b[x] = arr[left++];
            }
        }
        return b;
    }
}
