package leetcode;

import java.util.Map;

/**
 * @Author ZhangKe
 * @Date 2020/6/28 9:47
 * @Version 1.0
 * 长度最小的子数组
 */
public class leetcode209 {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int sum = 0;
        int len = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                len = len == 0 ? j - i + 1 : Math.min(len,j-i+1);
                sum -= nums[i++];
            }
        }
        return len;
    }
}
