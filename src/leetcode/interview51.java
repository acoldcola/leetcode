package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/13 11:37
 * @Version 1.0
 * 数组中的逆序对
 */
public class interview51 {
    public int reversePairs(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
