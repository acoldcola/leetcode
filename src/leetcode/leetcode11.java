package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/1/1 22:25
 * @Version 1.0
 */
public class leetcode11 {
    public static void main(String[] args) {
        maxArea(new int[] {45,156,54,212,21,15,6,2,6,32});
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left <= right) {
            max = Math.max(Math.min(height[left],height[right]) * (right - left),max);
            if (height[left] <= height[right]) {
               left ++;
            }else {
                right--;
            }
        }
        return max;
    }
}
