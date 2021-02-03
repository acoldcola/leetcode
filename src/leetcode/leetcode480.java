package leetcode;

import java.util.PriorityQueue;

/**
 * @auther ZhangKe
 * @date 2019/3/31 12:25
 * 滑动窗口的中位数
 */
public class leetcode480 {
    public static double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Long> min = new PriorityQueue<>();
        PriorityQueue<Long> max = new PriorityQueue<>(((o1, o2) -> {
            if (o2 - o1 > 0) {
                return 1;
            }
            return -1;
        }));
        double[] res = new double[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            min.add((long)(nums[i]));
        }
        int mid = k / 2;
        while (mid > 0) {
            max.add(min.poll());
            mid--;
        }
        if (k % 2 != 0) {
            res[0] = min.peek();
        }else {
            res[0] = (double)(min.peek() + max.peek()) / 2;
        }
        int left = 0;
        int right = k;
        while (left < nums.length - k) {
            if (!min.isEmpty() && nums[left] >= min.peek()) {
                min.remove((long)nums[left]);
            }else {
                max.remove((long)nums[left]);
            }
            if (!min.isEmpty() && nums[right] >= min.peek()) {
                min.add((long)nums[right]);
            }else {
                max.add((long)nums[right]);
            }
            if (max.size() > min.size()) {
                min.add(max.poll());
            }
            if (min.size() > max.size() + 1) {
                max.add(min.poll());
            }
            if (k % 2 != 0) {
                res[++left] = min.peek();
            }else {
                res[++left] =(double) (min.peek() + max.peek()) / 2;
            }
            right++;
        }
        return res;
    }
}
