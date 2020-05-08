package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

/**
 * @Author ZhangKe
 * @Date 2020/5/3 11:28
 * @Version 1.0
 */
public class leetcode5402 {
    public static void main(String[] args) {
        longestSubarray(new int[] {4,2,2,2,4,4,2,2},0);
    }
    public static int longestSubarray(int[] nums, int limit) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] >= max)  {
                    max = nums[j];
                }
                if (nums[j] <= min) {
                    min = nums[j];
                }
                if (max - min <= limit) {
                    result = result < (j-i+1) ? (j-i+1) : result;
                }else {
                    break;
                }
            }if (max == min && i == 0)  {
                return nums.length;
            }
        }
        return result;
    }
}
