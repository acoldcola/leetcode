package leetcode;

/**
 * @Author ZhangKe
 * @Date 2019/12/27 13:36
 * @Version 1.0
 * 任务调度器
 */
public class leetcode621 {
    public int leastInterval(char[] tasks, int n) {
        int[] x = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            x[tasks[i] - 65]++;
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < x.length; i++) {
            num += x[i];
            if (x[i] >= max) {
                max = x[i];
            }
        }
        int y = num - max;
        return (max-1) * n + max + max>num-max?max:0;
    }
}
