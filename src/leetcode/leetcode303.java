package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/1 10:22
 * @Version 1.0
 * 区域和检索 - 数组不可变
 */
public class leetcode303 {
    class NumArray {
        private int[] nums;
        private int[] sum;
        public NumArray(int[] nums) {
            this.nums = nums;
            sum = new int[nums.length + 1];
            for (int i = 1; i < sum.length; i++) {
                sum[i] = sum[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j + 1] - sum[i];
        }
    }
}
