package 竞赛.第44场双周赛;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2021/1/23 22:29
 * @Version 1.0
 */
public class Test1 {
    public int largestAltitude(int[] gain) {
        int[] a = new int[gain.length + 1];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + gain[i-1];
        }
        Arrays.sort(a);
        return a[a.length - 1];
    }
}
