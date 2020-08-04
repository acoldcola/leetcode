package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/17 9:23
 * @Version 1.0
 * 搜索插入位置
 */
public class leetcode35 {
    public static void main(String[] args) {
        leetcode35 leetcode35 = new leetcode35();
        System.out.println(leetcode35.searchInsert(new int[] {1,3,5,6},0));
    }
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) >> 1;
        while (left <= right) {
            if (nums[mid] < target) {
                left = mid + 1;
                mid = (left + right) >> 1;
                if (left > right) {
                    return mid - 1;
                }
            }else if (nums[mid] > target) {
                right = mid - 1;
                mid = (left + right) >> 1;
                if (left > right) {
                    return mid + 1;
                }
            }else {
                return mid;
            }
        }
        return mid;
    }
}
