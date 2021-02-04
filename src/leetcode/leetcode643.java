package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/4 9:41
 * @Version 1.0
 * 子数组最大平均数 I
 */
public class leetcode643 {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int left = 0;
        int right = 0;
        for (; right < k; right++) {
            sum += nums[right];
        }
        int res = sum;
        while (right < nums.length) {
            sum = sum - nums[left++] + nums[right++];
            res = Math.max(res,sum);
        }
        return (double) res / k;
    }
}
