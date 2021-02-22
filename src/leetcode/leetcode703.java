package leetcode;

import java.util.PriorityQueue;

/**
 * @Author ZhangKe
 * @Date 2021/2/22 14:12
 * @Version 1.0
 * 数据流中的第 K 大元素
 */
public class leetcode703 {
    private int k;
    private PriorityQueue<Integer> queue;
    public leetcode703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
    }

    public int add(int val) {
        queue.add(val);
        while (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }
}
