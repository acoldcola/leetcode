package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/12/24 13:43
 * @Version 1.0
 * 最短无序连续子数组
 */
public class leetcode581 {
    public static void main(String[] args) {
        leetcode581 l = new leetcode581();
        l.findUnsortedSubarray(new int[]{1, 5, 2, 4, 3});
    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int left = Integer.MAX_VALUE;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                int a = stack.pop();
                max = Math.max(max, nums[a]);
                left = Math.min(a, left);
                right = i;
            }
            stack.push(i);
        }
        if (right == 0) {
            return 0;
        }
        res = (right - left + 1);
        for (int j = right + 1; j < nums.length; j++) {
            if (nums[j] < max) {
                res++;
            }
        }
        return res;
    }
}
