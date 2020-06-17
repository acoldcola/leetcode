package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/6/17 14:59
 * @Version 1.0
 * 位1的个数
 */
public class leetcode191 {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            n &= n - 1;
            sum ++;
        }
        return sum;
    }
}
