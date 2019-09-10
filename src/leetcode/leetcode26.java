package leetcode;

/**
 * @auther ZhangKe
 * @date 2019/9/10 17:33
 * 删除排序数组中的重复项
 */
public class leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums.length;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            }else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
