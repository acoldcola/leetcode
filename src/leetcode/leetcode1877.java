package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/7/20 20:22
 * @Version 1.0
 * 数组中最大数对和的最小值
 */
public class leetcode1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            int a = nums[i] + nums[nums.length - 1 - i];
            res = Math.max(res, a);
        }
        return res;
    }
}
