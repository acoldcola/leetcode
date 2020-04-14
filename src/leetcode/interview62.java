package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/4/14 11:46
 * @Version 1.0
 * 圆圈中最后剩下的数字
 */
public class interview62 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int x = 0;
        while (n > 0) {
            x = (x + m - 1) % n;
            list.remove(x);
            n--;
        }
        return list.get(0);
    }
}
