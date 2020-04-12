package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/12 13:41
 * @Version 1.0
 * 整数转换
 */
public class interview05_06 {
    public int convertInteger(int A, int B) {
        int x = A ^ B;
        int sum = 0;
        x = Math.abs(x);
        while (x != 0) {
            x = x & (x-1);
            sum ++;
        }
        return sum;
    }
}
