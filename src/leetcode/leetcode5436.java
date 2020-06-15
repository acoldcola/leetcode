package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/14 10:30
 * @Version 1.0
 */
public class leetcode5436 {
    public int[] runningSum(int[] nums) {
        int[] a = new int[nums.length+1];
        a[0] = 0;
        for(int i = 1; i <= nums.length; i++) {
            a[i] = a[i-1] + nums[i-1];
        }
        System.arraycopy(a,0,a,0,nums.length);
        return a;
    }
}
