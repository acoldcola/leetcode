package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/2/7 23:31
 * @Version 1.0
 */
public class leetcode665 {
    public boolean checkPossibility(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                sum++;
            }
        }
        return sum <= 1;
    }
}
