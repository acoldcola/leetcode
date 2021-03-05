package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2019/12/27 13:36
 * @Version 1.0
 * 任务调度器
 */
public class leetcode621 {
    public int leastInterval(char[] tasks, int n) {
        int[] sum = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            sum[tasks[i] - 'A']++;
        }
        int res = 0;
        Arrays.sort(sum);
        while (sum[sum.length - 1] != 0) {
            int index = 0;
            boolean flag = true;
            for (int i = sum.length - 1; i >= 0; i--) {
                if (sum[i] == 0) {
                    if (sum[sum.length - 1] != 0) {
                        res += n - index + 1;
                        flag = false;
                    }
                    break;
                }
                res++;
                index++;
                sum[i]--;
                System.out.println(i);
                if (index > n) {
                    break;
                }
            }
            if (flag && sum[sum.length - 1] != 0) {
                res += n - index + 1;
            }
            Arrays.sort(sum);
        }
        return res;
    }
}
