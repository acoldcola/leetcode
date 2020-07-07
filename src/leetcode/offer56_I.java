package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/2 18:14
 * @Version 1.0
 * 滑动窗口的最大值
 */
public class offer56_I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] a = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k && i < a.length; i++) {
            max = Math.max(max,nums[i]);
        }
        a[0] = max;
        if (k >= a.length) {
            return a;
        }
        int j = 1;
        for (int i = j + k - 1; i < a.length; i++) {
            max = Math.max(max,nums[i]);
            a[j++] = max;
        }
        return a;
    }
}
