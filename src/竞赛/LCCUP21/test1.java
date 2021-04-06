package 竞赛.LCCUP21;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/4/5 14:56
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        purchasePlans(new int[] {2,5,3,5},6);
    }
    public static int purchasePlans(int[] nums, int target) {
        int res= 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] > target / 2) {
                break;
            }
            int left = i + 1;
            int right = nums.length;
            int sum  = target - nums[i];
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] == sum) {
                    left = mid + 1;
                } else if (nums[mid] < sum) {
                    left = mid + 1;
                } else if (nums[mid] > sum ) {
                    right = mid;
                }
            }
            res += left - 1 - i;
        }
        return res;
    }
}
