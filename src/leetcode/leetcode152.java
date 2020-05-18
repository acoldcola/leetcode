package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/18 10:19
 * @Version 1.0
 * 乘积最大子数组
 */
public class leetcode152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 1;
//            int j = i;
//            while (j < nums.length) {
//                sum *= nums[j++];
//                max = Math.max(sum,max);
//            }
//        }
//        return max;
        int max = 1;
        int left = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max *= nums[i];
            left = Math.max(max,left);
            if (nums[i] == 0) {
                max = 1;
            }
        }
        max = 1;
        int right = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            max *= nums[i];
            right = Math.max(max,right);
            if (nums[i] == 0) {
                max = 1;
            }
        }
        return Math.max(left,right);
    }
}
