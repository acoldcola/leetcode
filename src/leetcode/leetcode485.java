package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/13 17:23
 * @Version 1.0
 * 最大连续1的个数
 */
public class leetcode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum ++;
            }else {
                sum = 0;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}
