package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/3 15:56
 * @Version 1.0
 * 最大连续1的个数 III
 */
public class leetcode1004 {
    public static int longestOnes(int[] A, int K) {
        int[] a = new int[2];
        int left = 0;
        int right = 0;
        while (right < A.length) {
            a[A[right]] ++;
            if (a[1] + K < right - left + 1) {
                a[A[left++]]--;
                right++;
            }else {
                right++;
            }
        }
        return right - left;
    }
}
