package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/7/11 23:37
 * @Version 1.0
 */
public class leetcode5446 {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (res == 3) {
                break;
            }
            if (nums[i] != nums[i+1]) {
                res ++;
            }
            sum = i;
        }
        return nums[nums.length -1] - nums[sum + 1];
    }
}
