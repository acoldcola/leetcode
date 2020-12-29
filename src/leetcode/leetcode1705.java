package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author ZhangKe
 * @Date 2020/12/29 16:02
 * @Version 1.0
 * 吃苹果的最大数目
 */
public class leetcode1705 {
    public static int eatenApples(int[] apples, int[] days) {
        // int[2] int[0]水果代表数量, int[1]代表过期时间
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int res = 0;
        for (int i = 0; i < apples.length || !queue.isEmpty();i++) {
            while (!queue.isEmpty()) {
                int[] a = queue.peek();
                if (a[1] <= i) {
                    queue.poll();
                }else {
                    break;
                }
            }
            if (i < apples.length && apples[i] > 0) {
                queue.offer(new int[] {apples[i], days[i] + i});
            }
            if (!queue.isEmpty()) {
                int[] a = queue.peek();
                a[0]--;
                res++;
                if (a[0] == 0) {
                    queue.poll();
                }
            }
        }
        return res;
    }
}
