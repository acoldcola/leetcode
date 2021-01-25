package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/24 18:14
 * @Version 1.0
 * 最长连续递增序列
 */
public class leetcode674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 1;
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                a++;
                res = Math.max(res,a);
            }else {
                a = 1;
            }
        }
        return res;
    }
}
