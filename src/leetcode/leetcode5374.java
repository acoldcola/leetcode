package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/18 22:31
 * @Version 1.0
 * 逐步求和得到正数的最小值
 */
public class leetcode5374 {
    public int minStartValue(int[] nums) {
        int sum = 1;
        int x = 0;
        for (int i =0; i < nums.length; i++) {
            x +=nums[i];
            if (x < 0) {
                sum = Math.max(Math.abs(x) + 1,sum);
            }
        }
        return sum;
    }
}
