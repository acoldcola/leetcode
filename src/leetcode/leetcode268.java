package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/8/10 23:10
 * @Version 1.0
 * 丢失的数字
 */
public class leetcode268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            }else if (nums[mid] > mid) {
                right = mid -1;
            }
        }
        return left;
    }
}
