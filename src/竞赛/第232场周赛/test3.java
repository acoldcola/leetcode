package 竞赛.第232场周赛;

import java.util.PriorityQueue;

/**
 * @Author ZhangKe
 * @Date 2021/3/14 10:27
 * @Version 1.0
 */
public class test3 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> queue = new PriorityQueue<>((o1, o2) -> {
            double x = (o1[0]+1) / (o1[1] + 1) - o1[0] / o1[1];
            double y = (o2[0]+1) / (o2[1] + 1) - o2[0] / o2[1];
            if (y > x) {
                return 1;
            }else {
                return -1;
            }
        });
        for (int i = 0; i < classes.length; i++) {
            queue.offer(new double[] {classes[i][0],classes[i][1]});
        }
        while (extraStudents > 0) {
            double[] a = queue.poll();
            a[0]++;
            a[1]++;
            queue.offer(a);
            extraStudents--;
        }
        double res = 0.0;
        while (queue.isEmpty()) {
            double[] a = queue.poll();
            res += a[0] / a[1];
        }
        return res / classes.length;
    }
}
