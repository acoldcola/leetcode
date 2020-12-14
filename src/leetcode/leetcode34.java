package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/5/18 18:18
 * @Version 1.0
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class leetcode34 {
    public static void main(String[] args) {
        leetcode34 l = new leetcode34();
        l.searchRange(new int[] {5,7,7,8,8,10},8);
    }
    /*public int[] searchRange(int[] nums, int target) {
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
    }*/


    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = findLeft(nums,target);
        if (left == -1) {
            return new int[] {-1, -1};
        }
        int right = findRight(nums, target);
        return new int[] {left, right};
    }

    private int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] == target) {
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }else {
            return -1;
        }
    }

    private int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] == target) {
                right = mid;
            }else {
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }else {
            return -1;
        }
    }
}
