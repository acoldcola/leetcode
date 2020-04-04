package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/4 14:27
 * @Version 1.0
 * 存在重复元素 II
 */
public class leetcode219 {
    public static void main(String[] args) {
        int[] a = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(a,1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        if (k == nums.length) {
            return nums[0] == nums[k-1];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
