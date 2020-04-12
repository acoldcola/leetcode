package leetcode;

import java.util.Arrays;

/**
 * @Author ZhangKe
 * @Date 2020/4/10 17:28
 * @Version 1.0
 * 整数替换
 */
public class leetcode397 {
    public int integerReplacement(int n) {
        return f(n);
    }
    public int f(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return f(n/2) + 1;
        }else {
            return Math.min(f(n + 1),f(n - 1)) + 1;
        }
    }
}
