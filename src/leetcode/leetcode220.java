package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/1/21 18:00
 * @Version 1.0
 * 存在重复元素 III
 */
public class leetcode220 {
    public static void main(String[] args) {
        leetcode220 g = new leetcode220();
        g.containsNearbyAlmostDuplicate(new int[] {-2147483648,2147483647},1,1);
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        int[][] a = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }
        Arrays.sort(a,(o1, o2) -> o1[0] - o2[0]);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                long x = (long)a[i][0] - (long)a[j][0];
                x = x < 0 ? x * (-1) : x;
                if (x <= t) {
                    if (Math.abs(a[i][1] - a[j][1]) <= k) {
                        return true;
                    }
                }else {
                    break;
                }
            }
        }
        return false;
    }
}
