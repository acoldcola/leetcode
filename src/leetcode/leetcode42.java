package leetcode;

import java.util.Stack;

/**
 * @Author ZhangKe
 * @Date 2020/12/23 17:25
 * @Version 1.0
 * 接雨水
 */
public class leetcode42 {
    public static void main(String[] args) {
        leetcode42 l = new leetcode42();
        l.trap(new int[]{4, 2, 1, 2, 2, 3});
    }

    public int trap(int[] height) {
        int sum = 0;
        if (height == null || height.length < 3) {
            return sum;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            int max = 0;
            int min = 0;
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int a = stack.pop();
                // 最右边的更大，用最左边的算雨水
                if (stack.isEmpty()) {
                    min += height[a];
                    max = (i - a) * height[a];
                } else {
                    // 最左边的最大，用最右边的算雨水
                    max = (i - stack.peek() - 1) * height[i];
                    min += (a - stack.peek()) * height[a];
                }
            }
            sum += max - min;
            stack.push(i);
        }
        return sum;
    }
}
