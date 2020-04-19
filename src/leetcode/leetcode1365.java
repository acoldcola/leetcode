package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/19 22:41
 * @Version 1.0
 * 有多少小于当前数字的数字
 */
public class leetcode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length && j != i;j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
            out[i] = sum;
        }
        return out;
    }
}
