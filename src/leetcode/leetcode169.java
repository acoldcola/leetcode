package leetcode;

import java.util.Arrays;

/**
 * @auther ZhangKe
 * @date 2019/8/1 18:10
 * 求众数
 */
public class leetcode169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}