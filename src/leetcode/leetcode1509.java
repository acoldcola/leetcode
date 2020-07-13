package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/7/13 16:34
 * @Version 1.0
 * 三次操作后最大值与最小值的最小差
 */
public class leetcode1509 {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if (n <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        return Math.min(Math.min(nums[n-4]-nums[0],nums[n-3]-nums[1]),Math.min(nums[n-2]-nums[2],nums[n-1]-nums[3]));
    }
}
