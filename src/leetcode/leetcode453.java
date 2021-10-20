package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/10/20 19:38
 * @Version 1.0
 * 最小操作次数使数组元素相等
 */
public class leetcode453 {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length;i++) {
            res += nums[i] - nums[0];
        }
        return res;
//        int a = Arrays.stream(nums).min().getAsInt();
//        int res = 0;
//        for (int i = 0; i < nums.length;i++) {
//            res += nums[i] - a;
//        }
//        return res;
    }
}
