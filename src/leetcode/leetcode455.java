package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/12/25 10:21
 * @Version 1.0
 * 分发饼干
 */
public class leetcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        int j = 0;
        int i = 0;
        while (i < g.length && j < s.length) {
            if (s[j++] >= g[i]) {
                sum++;
                i++;
            }
        }
        return sum;
    }
}
