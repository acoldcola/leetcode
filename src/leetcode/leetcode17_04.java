package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/13 11:24
 * @Version 1.0
 * 消失的数字
 */
public class leetcode17_04 {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] a = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] ++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
