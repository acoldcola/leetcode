package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/2/20 13:09
 * @Version 1.0
 * 统计位数为偶数的数字
 */
public class leetcode1295 {
    public int findNumbers(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            int y = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                y++;
            }
            if (y % 2 == 0) {
                x++;
            }
        }
        return x;
    }
}
