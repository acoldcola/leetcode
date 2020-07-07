package leetcode;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/7/5 10:34
 * @Version 1.0
 */
public class leetcode5453 {
    public static void main(String[] args) {
        leetcode5453 l = new leetcode5453();
        l.getLastMoment(1000, new int[]{}, new int[]{1000});
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;
        for (int x : left)
        {
            res = Math.max(res, x);
        }
        for (int x : right)
        {
            res = Math.max(res, n-x);
        }
        return res;
    }
}
