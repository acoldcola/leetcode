package leetcode;

import java.time.Year;
import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/3/5 11:20
 * @Version 1.0
 * 乘积小于K的子数组
 */
public class leetcode713 {
    public static void main(String[] args) {
        int[] x = {10,9,4,3,8,3,3};
        System.out.println(numSubarrayProductLessThanK(x,19));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length < 1) {
            return 0;
        }
        int num = 0;
        int x = 1;
        int m=0,n=0;
        while (m < nums.length) {
            x *=nums[m];
            while (x > k) {
                x /= nums[n];
                n++;
            }
            num += m - n +1;
            m++;
        }
        return num;
    }
}
