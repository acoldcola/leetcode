package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/4/6 10:34
 * @Version 1.0
 * 删除有序数组中的重复项 II
 */
public class leetcode80 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int size = 1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                if (size < 2) {
                    size++;
                    j++;
                }
            }else {
                j++;
                size = 1;
            }
            nums[j] = nums[i];
        }
        return j+1;
    }
}
