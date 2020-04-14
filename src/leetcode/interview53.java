package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 14:21
 * @Version 1.0
 * 0～n-1中缺失的数字
 */
public class interview53 {
    public int missingNumber(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] != n++) {
                return n-1;
            }
        }
        return n;
    }
}
