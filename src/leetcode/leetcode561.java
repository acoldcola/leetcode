package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/4/21 14:25
 * @Version 1.0
 * 数组拆分 I
 */
public class leetcode561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
