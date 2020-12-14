package leetcode;


/**
 * @Author ZhangKe
 * @Date 2020/8/24 16:07
 * @Version 1.0
 * 连续子数组的最大和
 */
public class offer42 {
    public static void main(String[] args) {
        maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (a >= 0){
                a = a + nums[i];
            }else {
                a = nums[i];
            }
            max = Math.max(a,max);
        }
        return max;
    }
}
