package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/5 9:51
 * @Version 1.0
 * 不用加减乘除做加法
 */
public class offer65 {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return add(a ^ b, (a & b) << 1);
    }
}
