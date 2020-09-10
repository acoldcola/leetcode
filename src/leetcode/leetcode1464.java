package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/9/10 11:01
 * @Version 1.0
 * 数组中两元素的最大乘积
 */
public class leetcode1464 {
    public int maxProduct(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length -2] - 1);
    }
}
