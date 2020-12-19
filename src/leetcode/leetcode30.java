package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/12/19 17:49
 * @Version 1.0
 *  搜索插入位置
 */
public class leetcode30 {

    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
