package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/3/8 13:51
 * @Version 1.0
 * 下一个排列
 */
public class leetcode31 {
    public static void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int max = Integer.MAX_VALUE;
            int res = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    if (nums[j] < max) {
                        max = nums[j];
                        res = j;
                    }
                }
            }
            if (max != Integer.MAX_VALUE) {
                nums[i] ^= nums[res];
                nums[res] ^= nums[i];
                nums[i] ^= nums[res];
                for (int k = i+1; k < nums.length; k++) {
                    for (int m = k+1; m < nums.length; m++) {
                        if (nums[k] > nums[m]) {
                            int temp = nums[k];
                            nums[k] = nums[m];
                            nums[m] = temp;
                        }
                    }
                }
                return;
            }
        }
        Arrays.sort(nums);
    }
}
