package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/9/4 16:59
 * 除自身以外数组的乘积
 */
public class leetcode238 {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        productExceptSelf(a);
    }

    public static int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] a = new int[nums.length];
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            l[i] = left;
            left *= nums[i];
        }
        for (int j = nums.length - 1; j >=0; j--) {
            r[j] = right;
            right *= nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            a[i] = l[i] * r[i];
        }
        return a;
    }
}
