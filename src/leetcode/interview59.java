package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/24 0:26
 * @Version 1.0
 * 数组中的逆序对
 */
public class interview59 {
    public static void main(String[] args) {
        reversePairs(new int[] {7,5,6,4,3,8});
    }
    public static int reversePairs(int[] nums) {
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
