package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2022/8/18 21:48
 * @Version 1.0
 */
public class leetcode1224 {
    public int maxEqualFreq(int[] nums) {
        // 每个数的出现次数
        int[] a = new int[10010];
        // 来记录出现次数为某个值的数有多少个
        int[] b = new int[10010];
        Arrays.fill(a, 0);
        Arrays.fill(b, 0);
        int res = 0;
        int max = 1;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int cur = ++a[x];
            b[cur]++;
            b[cur - 1]--;
            max = Math.max(max, a[x]);
            len = i + 1;
            // 所有参数只有一个
            if (max == 1) {
                res = len;
            }
            // 有一个数值单独出现了一次
            if (b[max] * max + 1 == len) {
                res = len;
            }
            // 出现次数为 max 的数值只有一个
            if ((max - 1) * b[max - 1] + max == len) {
                res = len;
            }
        }
        return res;
    }
}
