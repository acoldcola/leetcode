package leetcode;

import java.util.Arrays;


/**
 * @auther ZhangKe
 * @date 2019/9/19 17:41
 * 数组中的第K个最大元素
 */
public class leetcode215 {
    public static void main(String[] args){
        int[] a = {3,2,1,5,6,4};
        System.out.println(findKthLargest(a,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        if (k > nums.length) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
