/**
 * @auther ZhangKe
 * @date 2019/2/20 17:50
 */
public class leetcode704 {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (r >= l) {
            int mid = (l + r) / 2;
            if (target < nums[mid]) {
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int t = 4;
        int search = search(nums, t);
        System.out.println(search);
    }
}
