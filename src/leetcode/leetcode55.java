package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/7/25 16:25
 * 跳跃游戏
 */
public class leetcode55 {
    public boolean canJump(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > x || x > nums.length -1) {
                break;
            }
            x = x > nums[i] + i ? x : nums[i] + i;
        }
        return x > nums.length - 1;
    }
}
