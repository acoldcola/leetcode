package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2021/3/24 21:56
 * @Version 1.0
 * 132 模式
 */
public class leetcode456 {
    public static void main(String[] args) {
        find132pattern(new int[] {1,0,1,-4,-3});
    }
    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (index > nums[i]) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                index = stack.pop();
            }
            stack.add(nums[i]);
        }
        return false;
    }
}
