package leetcode;

import java.util.*;

/**
 * @auther ZhangKe
 * @date 2019/3/31 11:53
 * 滑动窗口的最大值
 */
public class leetcode239 {
    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        maxSlidingWindow(a, 3);
    }

    /*public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 1 || k < 1 || nums.length < k) {
            return null;
        }
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            list.addLast(i);
            if (list.peekFirst() == i - k) {
                list.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[list.peekFirst()];
            }
        }
        return res;
    }*/

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            list.offer(i);
            if (list.peekFirst() == i - k) {
                list.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[list.peekFirst()];
            }
        }
        return res;
    }
}
