package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/6/24 17:59
 * @Version 1.0
 * 最接近的三数之和
 */
public class leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum > target) {
                    right --;
                }else if (sum < target){
                    left ++;
                }else {
                    return res;
                }
            }
        }
        return res;
    }
}
