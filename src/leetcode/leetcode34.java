package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/18 18:18
 * @Version 1.0
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                if (left == -1) {
                    left = i;
                }
                right = i;
            }
        }
        return new int[] {left,right};
    }
}
