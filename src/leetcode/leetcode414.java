package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/10/6 11:37
 * @Version 1.0
 * 第三大的数
 */
public class leetcode414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) {
            return nums[nums.length - 1];
        }
        int size = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (size == 2) {
                return nums[i + 1];
            }
            if (nums[i] < nums[i+1]) {
                size++;
            }
        }
        if (size == 2) {
            return nums[0];
        }
        return nums[nums.length - 1];
    }
}
