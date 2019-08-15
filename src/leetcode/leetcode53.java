package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/8/15 16:44
 * 最大子序和
 */
public class leetcode53 {
    public int maxSubArray(int[] nums) {
        int x = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum > 0) {
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            x = Math.max(sum,x);
        }
        return x;
    }
}
